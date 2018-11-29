package com.etong.exchange.preposition.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.etong.exchange.preposition.dao.MedicalPrepositionModelMapper;
import com.etong.exchange.preposition.entity.*;
import com.etong.exchange.preposition.entity.example.MedicalPrepositionModelExample;
import com.etong.exchange.preposition.service.SynService;
import com.etong.exchange.preposition.util.*;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

@Service
@Slf4j
public class SynServiceImpl implements SynService {

    @Value("${preposition.baseUrl}")
    public String baseUrl;

    @Value("${baseModelParam.INSTITUTION_CODE}")
    public String institutionCode;

    @Autowired
    private MedicalPrepositionModelMapper medicalPrepositionModelMapper;

    @Override
    public PersonalAppointment savePersonalAppointment(PersonalAppointment appointment) {
        log.info("save personal appointment");
        // 体检加项
        String param =JSONObject.toJSON(appointment).toString();
        //-------请求模板相关
        Map<String,String> condition = new HashMap<>();
        condition.put("httpData",param);
        condition.put("methodName",ClassUtils.getMethodName());
        MedicalPrepositionModel httpModel = postRequestSeriaParam(condition);
        if(        StringUtils.isEmpty(param)//参数
                || StringUtils.isEmpty(httpModel.getRequestModelCode()) //请求模板
                || StringUtils.isEmpty(httpModel.getMethodName())//本地方法名
                || StringUtils.isEmpty(httpModel.getModelName()) //WebService接口名称
        ){
            return null;
        }
        //-------请求模板相关End
        String wsMethodName = httpModel.getModelName();

        param = JsonNodeUtil.replaceSerializeDataSingle(param,httpModel.getRequestModelCode());
        String httpResult = HTTPUtils.httpALSPost(baseUrl, wsMethodName,param);

        Map resultEndMapContent = DocumentUtil.getEndResultContent(httpResult,httpModel);

        Document doc = null;
        try {
            doc = DocumentHelper.parseText(httpResult);
            Element rootElement = doc.getRootElement();
            //QueryAllExamGroupResult wsdl文档的result节点
            StringBuffer resultDatastr = new StringBuffer();
            resultEndMapContent.forEach((k,v)->{

                String resultData = DocumentUtil.parserNode(rootElement, k.toString());
                resultDatastr.append(resultData);

            });
            String resultHTTPData = resultDatastr.toString();

                //应该取出 体检编号   SET

//                String data = responseSeriaData(resultHTTPData,httpModel);
            Map resultEndMap = JSONObject.parseObject(JSONObject.parseObject(resultHTTPData).getString("data"));
//            String rr = "{\"msg\":\"success\",\"code\":\"0000\",\"data\":{\"examNo\":\"\",\"CureNo\":\"YY1811270007\"}}";
//            Map resultEndMap = JSONObject.parseObject(JSONObject.parseObject(rr).getString("data"));
            Set examNoResultSet = new HashSet<>();

            if(null != resultEndMap) {
                resultEndMap.forEach((key, value) -> {
                    if (key.equals("examNo") && !"".equals(value.toString())) {
                        examNoResultSet.add(value.toString());
                    } else if (key.equals("CureNo") && !"".equals(value)) {
                        examNoResultSet.add(value.toString());
                    } else if (key.equals("examNum") && !"".equals(value)) {
                        examNoResultSet.add(value.toString());
                    }
                });
            }

            if(null == examNoResultSet){
                appointment.setExamNo(null);
            }else if(examNoResultSet.iterator().hasNext()){
                appointment.setExamNo(examNoResultSet.iterator().next().toString());
                //到这里证明预约成功  所以要发送短信
//                if(institutionCode.equals("25003") && StringUtil.isNotBlank(appointment.getPhone())){
//                    //短信业务  中山
//
//
//                }
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }


        return appointment;
    }

    @Override
    public ResultBean<PersonalAppointment> cancelPersonalAppointment(PersonalAppointment appointment) {
        ResultBean<PersonalAppointment> resultBean = new ResultBean<>();
        log.info("cancel personal appointment");
        StringBuffer resultCode = new StringBuffer();

        String param =JSONObject.toJSON(appointment).toString();
        //-------请求模板相关
        Map<String,String> condition = new HashMap<>();
        condition.put("httpData",param);
        condition.put("methodName",ClassUtils.getMethodName());
        MedicalPrepositionModel httpModel = postRequestSeriaParam(condition);
        if(        StringUtils.isEmpty(param)//参数
                || StringUtils.isEmpty(httpModel.getRequestModelCode()) //请求模板
                || StringUtils.isEmpty(httpModel.getMethodName())//本地方法名
                || StringUtils.isEmpty(httpModel.getModelName()) //WebService接口名称
        ){
            return null;
        }
        //-------请求模板相关End
        String wsMethodName = httpModel.getModelName();

        param = JsonNodeUtil.replaceSerializeDataSingle(param,httpModel.getRequestModelCode());
        String httpResult = HTTPUtils.httpALSPost(baseUrl, wsMethodName,param);

        Map resultEndMap = DocumentUtil.getEndResultContent(httpResult,httpModel);

        Document doc = null;
        try {
            doc = DocumentHelper.parseText(httpResult);
            Element rootElement = doc.getRootElement();
            //QueryAllExamGroupResult wsdl文档的result节点
            StringBuffer resultDatastr = new StringBuffer();
            resultEndMap.forEach((k,v)->{

                String resultData = DocumentUtil.parserNode(rootElement, k.toString());
                resultDatastr.append(resultData);

            });
                String resultHTTPData = resultDatastr.toString();
                //响应相关------------------------------------------
                Map resultMap = JSONObject.parseObject(resultHTTPData);
                resultMap.forEach((key,value)->{
                    if(key.equals("Code")){
                        resultCode.append(value.toString());
                    }else if(key.equals("code")){
                        resultCode.append(value.toString());
                    }
                });
                log.info("-----------------------------------解析后的响应码:"+resultCode);


            } catch (DocumentException e) {
                e.printStackTrace();
            }
        resultBean.setCode(resultCode+"");
        resultBean.setData(appointment);
        return resultBean;
        }



    public List<MedicalPackage> readRemotePackages() {

        List<MedicalPackage> packages = new
                ArrayList<MedicalPackage>();
        Map<String,String> condition = new HashMap<>();
        condition.put("methodName",ClassUtils.getMethodName());
        MedicalPrepositionModel httpModel = getRequestSeriaParam(condition);

        try{
            httpModel.getRequestModelCode();
        }catch (NullPointerException e){
            log.error("模板内容:"+e.getMessage());
            return packages;
        }


        String httpResult = HTTPUtils.httpGet
                (baseUrl,httpModel.getModelName());
        Map resultEndMap = DocumentUtil.getEndResultContent(httpResult,httpModel);

        Document doc = null;
        try {
            doc = DocumentHelper.parseText(httpResult);
            Element rootElement = doc.getRootElement();
            //QueryAllExamGroupResult wsdl文档的result节点
            StringBuffer resultDatastr = new StringBuffer();
            resultEndMap.forEach((k,v)->{

                String resultData = DocumentUtil.parserNode(rootElement, k.toString());
                resultDatastr.append(resultData);

            });
            //-----------------响应模板相关

            String data = responseSeriaData(resultDatastr.toString(),httpModel);
            data =  JSONObject.parseObject(data).getString("data");

            packages =  JSONObject.parseArray(data, MedicalPackage.class);



        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return packages;
    }




    @Override
    public List<MedicalItemCategory> readRemoteItems() {
        List itemList = new ArrayList();
        List<MedicalItemCategory> cateList = new ArrayList<>();

        Map<String,String> condition = new HashMap<>();
        condition.put("methodName",ClassUtils.getMethodName());
        MedicalPrepositionModel httpModel = getRequestSeriaParam(condition);

        try{
            httpModel.getRequestModelCode();
        }catch (NullPointerException e){
            log.error("模板内容:"+e.getMessage());
            return cateList;
        }

        String httpResult = HTTPUtils.httpGet
                (baseUrl,httpModel.getModelName());
        Map resultEndMap = DocumentUtil.getEndResultContent(httpResult,httpModel);

        Document doc = null;
        try {
            doc = DocumentHelper.parseText(httpResult);
            Element rootElement = doc.getRootElement();
            //QueryAllExamGroupResult wsdl文档的result节点
            StringBuffer resultDatastr = new StringBuffer();
            resultEndMap.forEach((k,v)->{

                String resultData = DocumentUtil.parserNode(rootElement, k.toString());
                resultDatastr.append(resultData);

            });
            //-------------------响应模板相关
            String data = responseSeriaData(resultDatastr.toString(),httpModel);
            data =  JSONObject.parseObject(data).getString("data");
            //-------------------响应模板相关END
            itemList = JSONObject.parseArray(data, MedicalItem.class);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        MedicalItemCategory category = new MedicalItemCategory();
        category.setCode("default"+institutionCode);
        category.setName("全部加项");
        category.setInstitutionCode(institutionCode);

        category.setItems(itemList);
        cateList.add(category);
        return cateList;

    }






    @Override
    public ResultBean<List<MedicalReport>> getReports(String identity, String name, String mobile, String examNo) {
        log.info("get reports");

        //阿拉善测试
        ResultBean<List<MedicalReport>> resultBean = new ResultBean<List<MedicalReport>>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("identity",identity);
        paramsMap.put("examNo",examNo);
        String params = JSONObject.toJSONString(paramsMap);

        Map<String,String> condition = new HashMap<>();
        condition.put("methodName",ClassUtils.getMethodName());
        condition.put("httpData",params);
        MedicalPrepositionModel httpModel = postRequestSeriaParam(condition);

        if(        StringUtils.isEmpty(httpModel.getRequestModelCode()) //请求模板
                || StringUtils.isEmpty(httpModel.getMethodName())//本地方法名
                || StringUtils.isEmpty(httpModel.getModelName()) //WebService接口名称
        ){
            return null;
        }
        String paramsRequest = JsonNodeUtil.replaceSerializeDataSingle(params,httpModel.getRequestModelCode());

        String httpResult = HTTPUtils.httpALSPost(baseUrl,httpModel.getModelName(),paramsRequest);
        Map resultEndMap = DocumentUtil.getEndResultContent(httpResult,httpModel);

        Document doc = null;
        try {
            doc = DocumentHelper.parseText(httpResult);
            Element rootElement = doc.getRootElement();
            //QueryAllExamGroupResult wsdl文档的result节点
            StringBuffer resultDatastr = new StringBuffer();
            resultEndMap.forEach((k,v)->{

                String resultData = DocumentUtil.parserNode(rootElement, k.toString());
                resultDatastr.append(resultData);

            });
            //---------------模板相关
            ;
            String data = responseSeriaData(resultDatastr.toString(),httpModel);
            data = JSONObject.parseObject(data).getString("data");

            if(StringUtils.isEmpty(data)){
                return resultBean;
            }
            List<MedicalReport> httpMedicalResult = new ArrayList<>();
            //---------------模板相关End
            if(data.charAt(0) == '[') {
                httpMedicalResult = JSONObject.parseArray(data, MedicalReport.class);
            }else if(data.charAt(0) == '{'){
                MedicalReport reportDetail = JSONObject.toJavaObject(JSONObject.parseObject(data),MedicalReport.class);
                httpMedicalResult.add(reportDetail);
            }
            resultBean.setData(httpMedicalResult);

        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return resultBean;
    }


    public ResultBean<List<MedicalReport>> getSimpleReports(String identity, String name, String mobile,
                                                            String startDate, String endDate) {
        log.info("get getSimpleReports");
//阿拉善测试
        ResultBean<List<MedicalReport>> resultBean = new ResultBean<List<MedicalReport>>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("identity",identity);

        String params = JSONObject.toJSONString(paramsMap);

        Map<String,String> condition = new HashMap<>();
        condition.put("methodName",ClassUtils.getMethodName());
        condition.put("httpData",params);
        MedicalPrepositionModel httpModel = postRequestSeriaParam(condition);

        if(        StringUtils.isEmpty(httpModel.getRequestModelCode()) //请求模板
                || StringUtils.isEmpty(httpModel.getMethodName())//本地方法名
                || StringUtils.isEmpty(httpModel.getModelName()) //WebService接口名称
        ){
            return null;
        }
        String paramsRequest = JsonNodeUtil.replaceSerializeDataSingle(params,httpModel.getRequestModelCode());

        String httpResult = HTTPUtils.httpALSPost(baseUrl,httpModel.getModelName(),paramsRequest);

        Map resultEndMap = DocumentUtil.getEndResultContent(httpResult,httpModel);

        Document doc = null;
        try {
            doc = DocumentHelper.parseText(httpResult);
            Element rootElement = doc.getRootElement();
            //QueryAllExamGroupResult wsdl文档的result节点
            StringBuffer resultDatastr = new StringBuffer();
            resultEndMap.forEach((k,v)->{

                String resultData = DocumentUtil.parserNode(rootElement, k.toString());
                resultDatastr.append(resultData);

            });
            //---------------模板相关

            String data = responseSeriaData(resultDatastr.toString(),httpModel);
            data = JSONObject.parseObject(data).getString("data");

            List<MedicalReport> httpMedicalResult = JSONObject.parseArray(data,MedicalReport.class);
            resultBean.setData(httpMedicalResult);

        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return resultBean;
    }

    private String responseSeriaData(String httpData,MedicalPrepositionModel model){
        MedicalPrepositionModelExample medicalPrepositionModelExample = new MedicalPrepositionModelExample();
        medicalPrepositionModelExample.createCriteria()
                .andInstitutionCodeEqualTo(institutionCode)
                .andMethodNameEqualTo(model.getMethodName());
        int flag = medicalPrepositionModelMapper.countByExample(medicalPrepositionModelExample);

        if(flag > 0 && null == model.getResponseModelCode()){
            //-------模板持久化

            String responseModelCode = JsonNodeUtil.getBaseisCode(httpData).replaceAll("\"","\"");
            model.setResponseModelCode(responseModelCode);

            medicalPrepositionModelMapper.updateByPrimaryKey(model);
            //数据库已经新增模板  请维护
            log.error("【响应模板】已经更新,请维护!!!model:"+responseModelCode);
            return null;
        }
        List<MedicalPrepositionModel> medicalPrepositionModelList =
                medicalPrepositionModelMapper.selectByExample(medicalPrepositionModelExample);

        String responseCode = medicalPrepositionModelList.get(0).getResponseModelCode();

        log.info("通过模板序列化前的数据:"+httpData);
        String modelResultData = JsonNodeUtil.replaceSerializeDataSingle(httpData,responseCode);
        log.info("通过模板序列化后的数据:"+modelResultData);

        return modelResultData;
    }

    private MedicalPrepositionModel getRequestSeriaParam(Map<String,String> condition){
        //1.根据方法名称 体检机构号去查找 当前请求模板
        MedicalPrepositionModelExample medicalPrepositionModelExample = new MedicalPrepositionModelExample();
        medicalPrepositionModelExample.createCriteria()
                .andInstitutionCodeEqualTo(institutionCode)
                .andMethodNameEqualTo(condition.get("methodName"));
        int flag = medicalPrepositionModelMapper.countByExample(medicalPrepositionModelExample);

        if(flag < 1){
            //-------模板持久化
            MedicalPrepositionModel resultModel = new MedicalPrepositionModel();
            resultModel.setMethodName(condition.get("methodName"));
            resultModel.setInstitutionCode(institutionCode);
            log.error(resultModel.getModelName()+"--,WebServiceRequestModel:GET,体检机构:"+institutionCode);
            resultModel.setRequestModelCode("GET");

            medicalPrepositionModelMapper.insert(resultModel);
            //数据库已经新增模板  请维护
            log.error("数据库已经新增模板,请维护!!!model");
            return null;
        }
        List<MedicalPrepositionModel> medicalPrepositionModelList =
                medicalPrepositionModelMapper.selectByExample(medicalPrepositionModelExample);

        MedicalPrepositionModel resultModel = medicalPrepositionModelList.get(0);

        return resultModel;
    }


    private MedicalPrepositionModel postRequestSeriaParam(Map<String,String> condition){
        //1.根据方法名称 体检机构号去查找 当前请求模板
        MedicalPrepositionModelExample medicalPrepositionModelExample = new MedicalPrepositionModelExample();
        medicalPrepositionModelExample.createCriteria()
                .andInstitutionCodeEqualTo(institutionCode)
                .andMethodNameEqualTo(condition.get("methodName"));
        int flag = medicalPrepositionModelMapper.countByExample(medicalPrepositionModelExample);

        if(flag < 1){
            //-------模板持久化
            MedicalPrepositionModel resultModel = new MedicalPrepositionModel();
            resultModel.setMethodName(condition.get("methodName"));
            resultModel.setInstitutionCode(institutionCode);
            log.error("WebServiceRequestModel:"+condition.get("httpData")+",体检机构:"+institutionCode);
            String responseModelCode = JsonNodeUtil.getBaseisCode(condition.get("httpData")).replaceAll("\\\\","");
            resultModel.setRequestModelCode(responseModelCode);

            medicalPrepositionModelMapper.insert(resultModel);
            //数据库已经新增模板  请维护
            log.error("数据库已经新增模板,请维护!!!model:"+responseModelCode);
            return null;
        }
        List<MedicalPrepositionModel> medicalPrepositionModelList =
                medicalPrepositionModelMapper.selectByExample(medicalPrepositionModelExample);

        MedicalPrepositionModel resultModel = medicalPrepositionModelList.get(0);

        return resultModel;
    }

}
