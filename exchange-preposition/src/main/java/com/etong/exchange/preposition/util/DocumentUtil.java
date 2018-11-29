package com.etong.exchange.preposition.util;

import com.alibaba.fastjson.JSON;
import com.etong.exchange.preposition.entity.MedicalPrepositionModel;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Slf4j
public class DocumentUtil {
    /**	 递归遍历所有父节点、子节点
     *  @param ele
     * */
    public static String parserNode(Element ele, String node){
        if(node.equals(ele.getName())){
            return ele.getText().trim();
        }else{
            //从root根节点开始遍历，像【属性=值】的形式存为一个Attribute对象存储在List集合中
//            List<Attribute> attrList = ele.attributes();
//            for(Attribute attr : attrList){
//                //每循环一次，解析此节点的一个【属性=值】，没有则输出空
//                String name = attr.getName();
//                String value = attr.getValue();
//                System.out.println(name+"="+value);
//            }
            List<Element> eleList = ele.elements();
            //递归遍历父节点下的所有子节点
            for(Element e : eleList){
                return parserNode(e,node);
            }
        }
        return "";
    }

    /**
     * 针对与xml返回结果   获取节点内容
     * 获取<></>以内的内容
     * @return Map
     * */
    public static Map<String,String> getDataContext(String html) {
        //定义匹配规则：
        Map<String,String> httpResult = new HashMap<>();
        String regex2 = "<(.*?)>(.*?)</.*?>";

        Pattern compile = Pattern.compile(regex2);
        Matcher matcher = compile.matcher(html);
        while(matcher.find()){
            httpResult.put(matcher.group(1),matcher.group(2));
        }

        return httpResult;
    }

    /**
     * 根据WebService返回的的xml上下文中
     * 获取 result节点里面的json
     * 也就是最终返回数据
     * @return json String map ..
     * */
    public static Map<String,String> getEndResultContent(String xmlResult, MedicalPrepositionModel model){

        String xmlResultStr = "<"+model.getModelName()+"Response xmlns=\"http://tempuri.org/\">";
        int startIndex = xmlResultStr.length();
        String result =  xmlResult.substring(xmlResult.indexOf(xmlResultStr)+startIndex,xmlResult.indexOf("</"+model.getModelName()+"Response>"));
        Map<String,String> mapResult = getDataContext(result);
        return mapResult;
    }


    public static void main(String[] args){
        String resultModelData = null;
        String httpResultData =
                "<A>value_A</A>" +
                "<B>" +
                "<B_a>valueB_a</B_a>" +
                "<B_b>valueB_b</B_b>" +
                "</B>" +
                "<C>value_C</C>";
        //最后应该转成
        // {
        //      "A":"value_A",
        //      "B":[{"B_a":"valueB_a","B_b":"valueB_b"}],
        //      "C":"value_C"
        // }
    }
    /**
     * 根据node检索到当前节点内容类型
     *
     * -1.其他 0.json 1.xml
     * */
    public static int checkContextType(String httpResult){
        int resultFlag = -1;
        char flag = httpResult.charAt(0);
        switch(flag){
            case '{':
                log.info("WebService的Result节点报文类型:JSON");
                resultFlag = 0;
                break;
            case '[':
                log.info("WebService的Result节点报文类型:JSONArray");
                resultFlag = 0;
                break;
            case '<':
                log.info("WebService的Result节点报文类型:XML");
                resultFlag = 1;
                break;
        }
        return resultFlag;

    }


}
