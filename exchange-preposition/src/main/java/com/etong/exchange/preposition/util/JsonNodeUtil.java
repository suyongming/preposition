package com.etong.exchange.preposition.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class JsonNodeUtil {
        /**
         * 解析json 基础结构
         * 就是把所有的key 以数组为层级去重
         * */
    public static String getBaseisCode(String jsonNode){
        jsonNode.replace(" ", "");
        boolean flag = false;
        if(jsonNode.charAt(0) == '['){
            jsonNode = getJsonByKeyCountMax(jsonNode);
            flag = true;
        }
        jsonNode = jsonNode.replaceAll("null","\"\"");

        Map conditionModel = (Map)JSONObject.parseObject(jsonNode);

        Iterator entries = conditionModel.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();

            String key = entry.getKey().toString();
            if(StringUtils.isEmpty(entry.getValue())){
                entry.setValue("");
                continue;
            }
            String value = entry.getValue().toString();

//            System.out.println("截取之前:------Key = " + key + ", Value = " + value);
            if(value.charAt(0) == '{'){
                Map singleMap = JSONObject.parseObject(value);
                Map tempMap = new HashMap();
                singleMap.forEach((singleKey,singleValue)->{
                    String endKey = singleKey.toString();
                    String endValue = singleValue.toString();
                    if(singleValue instanceof List && !endValue.equals("[]")){
                        String singleNode = getJsonByKeyCountMax(endValue);
                        endValue = "["+getBaseisCode(singleNode)+"]";
                        tempMap.put(endKey,JSONArray.parseArray(endValue));
                        //不做这个操作 后果就是 嵌套array时获取的模板 是"[开头 而[开头才是正确的
                        return;
                    }
                    tempMap.put(endKey, endValue);

                });
                entry.setValue(tempMap);

            }
            if(StringUtil.isNotBlank(value) && value.charAt(0) == '[' && !value.equals("[]")) {
                //如果是数组 则递归 取属key数最多的对象作为模板

                String singleMap = getJsonByKeyCountMax(value);
                value = "["+getBaseisCode(singleMap)+"]";
                //不做这个操作 后果就是 嵌套array时获取的模板 是"[开头 而[开头才是正确的
                entry.setValue(JSONArray.parseArray(value));
            }
        }

        if(flag){
           return "["+conditionModel.toString()+"]";
        }
        return conditionModel.toString();

    }


    /**
     * 如果是数组 则递归
     * 如果对象们的key出现差集则去重,组合到一个map
     * @Param jsonArray String
     * @Return modelJson String
     * */
    public static String getJsonByKeyCountMax(String json){
        if(json.charAt(0) == '{'){
            return json;
        }
        Map resultMap = new HashMap();
        Set<String> set = new HashSet<>();
        List list = JSONArray.parseArray(json);
        for(Object node:list){
            Map nodeMap = (Map)JSONObject.parseObject(node.toString());
            Iterator map = nodeMap.entrySet().iterator();
            while(map.hasNext()){
                Map.Entry entry = (Map.Entry)map.next();
                String key = entry.getKey().toString();
                String value = entry.getValue().toString();

                if(set.add(key)){
                    resultMap.put(key,value);

                }
            }

        }

        return JSON.toJSONString(resultMap);
    }

    /**
     * 根据模板替换当前data的key
     * @return this obj json
     * */
    public static String replaceSerializeDataSingle(String httpData,String responseCode){
        Map modelMap = StringUtil.stringJsonToMapByLimitOne(responseCode);
//        log.info("items模板信息:"+modelMap.toString());
//        log.info("递归节点信息:"+httpData);

            Map resultToJson = new HashMap();
            Map httpMap = JSONObject.parseObject(httpData);
            //此处只是需要一个对应的key
            //这个key 从responseCode 里面找到对应的
            Iterator httpMapEntries = httpMap.entrySet().iterator();
            while (httpMapEntries.hasNext()) {
                Map.Entry entry = (Map.Entry) httpMapEntries.next();
                String httpKey = entry.getKey().toString();

                if(null == entry.getValue()){
                    String endKey = modelMap.get(httpKey).toString();
                    resultToJson.put(endKey, "");
                    continue;
                }

                String httpValue = entry.getValue().toString();

                if(StringUtils.isEmpty(httpValue)){
                    String endKey = modelMap.get(httpKey).toString();
                    resultToJson.put(endKey, "");
                    continue;
                }
                if(!modelMap.containsKey(httpKey)) {
                    // 说明实施是配置不到这条字段的
                    log.error("(key:"+httpKey+",value:"+httpValue+"),未在模板中配置的数据请配置，无法映射到RESULT");
                    boolean flag = StringUtils.isEmpty(httpValue)?true:false;
                    if(flag){
                        resultToJson.put(httpKey,"");
                    }
                    resultToJson.put(httpKey,httpValue);
                    continue;
                }
                if(httpValue.equals("[]")) {
                    String nulEndKey = httpKey+"Array";
                    resultToJson.put(modelMap.get(nulEndKey),JSONArray.parseArray(httpValue));
                    continue;
                }

                String endKey = modelMap.get(httpKey).toString();
                String endValue =  httpValue;
                if(httpValue.charAt(0) == '{'){
                    log.info("对象节点:"+httpKey+"{...}---------------------------");
                    endKey = modelMap.get(httpKey+"Node").toString();
                    String thisNodeResponseCode = modelMap.get(httpKey).toString();
                    endValue = replaceSerializeDataSingle(httpValue,thisNodeResponseCode);
                    //递归到最底层在处理
                    JSONObject valueJson = JSONObject.parseObject(endValue);
                    resultToJson.put(endKey,valueJson);
                    continue;

                }
//                System.out.println("Key = " + httpKey + ", Value = " + httpValue);
                //如果当前key 等于model的 key映射value  则获取value 替换掉当前key

                if(!endValue.equals("[]") &&
                        endValue.charAt(0) == '['){
                    log.info("数组节点:"+httpKey+"[{...}]---------------------------");
                    //一个不为空 []的数组
                    //此时endKey代表json数组  而不是模板 所以需要实施在当前节点的json上添加一个字段
                    //配置规则为 key : value   "原字段+Array" : "参考文档"
                    endKey = modelMap.get(httpKey+"Array").toString();
                    //responseCode 要等于当前key对应的节点 否则永远递归第一层模板
                    String thisNodeResponseCode = modelMap.get(httpKey).toString();
                    endValue = replaceSerializeData(httpValue,thisNodeResponseCode);
                    //递归到最底层在处理
                    resultToJson.put(endKey,JSONArray.parseArray(endValue));

                }else{
                    resultToJson.put(endKey,endValue);
                }


            }

        return JSONObject.toJSONString(resultToJson);
    }

    /**
     * 根据模板替换当前data的key
     * @return this obj json
     * */
    public static String replaceSerializeData(String httpData,String responseCode){
        List resultListToStr = new ArrayList();
        Map modelMap = StringUtil.stringJsonToMapByLimitOne(responseCode);
//        log.info("items模板信息:"+modelMap.toString());
//        log.info("递归节点信息:"+httpData);
        List resultList = JSONArray.parseArray(httpData);

        resultList.forEach(resultNode->{
            Map resultToJson = new HashMap();
            Map httpMap = (Map) JSONObject.parseObject(resultNode.toString());
            //此处只是需要一个对应的key
            //这个key 从responseCode 里面找到对应的
            Iterator httpMapEntries = httpMap.entrySet().iterator();
            while (httpMapEntries.hasNext()) {
                Map.Entry entry = (Map.Entry) httpMapEntries.next();
                String httpKey = entry.getKey().toString();
                if(null == entry.getValue() && !entry.getValue().toString().equals("[]")){
                    String endKey = modelMap.get(httpKey).toString();
                    resultToJson.put(endKey, "");
                    continue;
                }
                String httpValue = entry.getValue().toString();
                if(StringUtils.isEmpty(httpValue)){
                        String endKey = modelMap.get(httpKey).toString();
                        resultToJson.put(endKey, "");
                        continue;
                }
                if(!modelMap.containsKey(httpKey)) {
                    log.info("对象节点:"+httpKey+"{...}---------------------------");
                    // 说明实施是配置不到这条字段的
                    log.error("(key:"+httpKey+",value:"+httpValue+"),未在模板中配置的数据请配置，无法映射到RESULT");
                    boolean flag = StringUtils.isEmpty(httpValue)?true:false;
                    if(flag){
                        resultToJson.put(httpKey,"");
                    }
                    resultToJson.put(httpKey,httpValue);
                    continue;
                }

                if(httpValue.equals("[]")) {
                    String nulEndKey = httpKey+"Array";
                    resultToJson.put(modelMap.get(nulEndKey),JSONArray.parseArray(httpValue));
                    continue;
                }
                String endKey = modelMap.get(httpKey).toString();
                String endValue =  httpValue;
                if(httpValue.charAt(0) == '{'){

                    endKey = modelMap.get(httpKey+"Node").toString();
                    String thisNodeResponseCode = modelMap.get(httpKey).toString();
                    endValue = replaceSerializeDataSingle(httpValue,thisNodeResponseCode);
                    //递归到最底层在处理
                    JSONObject valueJson = JSONObject.parseObject(endValue);
                    resultToJson.put(endKey,valueJson);
                    continue;

                }
//                System.out.println("Key = " + httpKey + ", Value = " + httpValue);
                //如果当前key 等于model的 key映射value  则获取value 替换掉当前key

                if(!endValue.equals("[]") &&
                        endValue.charAt(0) == '['){
                    log.info("数组节点:"+httpKey+"[{...}]----------------------------------");
                    //一个不为空 []的数组
                    //此时endKey代表json数组  而不是模板 所以需要实施在当前节点的json上添加一个字段
                    //配置规则为 key : value   "原字段+Array" : "参考文档"
                    endKey = modelMap.get(httpKey+"Array").toString();
                    //responseCode 要等于当前key对应的节点 否则永远递归第一层模板
                    String thisNodeResponseCode = modelMap.get(httpKey).toString();
                    endValue = replaceSerializeData(httpValue,thisNodeResponseCode);
                    //递归到最底层在处理
                    resultToJson.put(endKey,JSONArray.parseArray(endValue));

                }else{
                    resultToJson.put(endKey,endValue);
                }


            }

            resultListToStr.add(resultToJson);

        });
        //不加DisableCircularReferenceDetect  可能会出现$ref对象重复引用问题
        return JSON.toJSONString(resultListToStr, SerializerFeature.DisableCircularReferenceDetect);
    }





    public static void main(String[] args){
        String result12 = "{\"code\":\"01\",\"gender\":0,\"description\":\"\",\"remark\":\"\",\"avatar\":\"\",\"delFlag\":0,\"marital\":0,\"institutionCode\":\"190102\",\"price\":\"348.00\",\"name\":\"A套餐\",\"id\":\"919cc1f1-86be-42a5-8d29-ada1a7880a44\",\"suit\":\"\",\"items\":[{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0},{\"itemPriceShow\":0,\"projectShow\":0}]}";

        Map node = (Map)JSONObject.parseObject(result12);

        node.forEach((key,value)->{
            if(value instanceof List){
                System.out.println(key);
            }
        });

    }
}
