package com.etong.exchange.preposition.util;

import org.dom4j.DocumentException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTTPUtils {

    private static Map<String,String> getParamsModel(String requestContext){
        Map<String,String> resultMap = new HashMap();
        List<String> paramsModel = new ArrayList<>();
        String regex = "&lt;(.*?)&gt;<font class=value>(.*?)</font>&lt;/.*?&gt;";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(requestContext);
        //matcher.group(0) 代表regex全文
        while(matcher.find()){
            System.out.println(matcher.group(0)+"------"+matcher.group(1));

            resultMap.put(matcher.group(1),matcher.group(2));
        }


        return resultMap;
    }


    public static void main(String[] args) throws IOException, DocumentException {
        String methodName = "savePersonalAppointment-OrderGRYY";
        try {
//            methodName = methodName.substring(methodName.indexOf("-")+1,methodName.length());
            System.out.println(methodName.contains("savePersonalAppointment"));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("呵呵");
        }
            System.out.println(methodName);
        //根据获取体检机构的请求模板
        String paramMethod = "QueryPatExamRecordsByRequestStr";
        String baseUrl = "http://wa.zs-hospital.sh.cn:8700/PhyAppWS/PhyAppWS.asmx";
//        String contextResult = getContextByWebServiceMethod(baseUrl,paramMethod);
//        System.out.println(contextResult);

//        Map<String,String> paramsModel = getParamsModel(contextResult);

//        serializeJson(paramsModel);
//        System.out.println(paramsModel.toString());



    }

    private static Map<String,String> serializeJson(Map paramsModel){
        Map resultMap = new HashMap();

        paramsModel.forEach((key,value)->{


        });

        return resultMap;
    }

    public static String httpALSPost(String baseUrl,String httpMethod,String wsdlParam){

        String soap="<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                +" <soap:Header>"
                +" <MySoapHeader xmlns=\"http://tempuri.org/\">"
                +" <Sign></Sign>"
                +"<Time></Time>"
                +" </MySoapHeader>"
                +" </soap:Header>"
                +" <soap:Body>"
                +"  <"+httpMethod+" xmlns=\"http://tempuri.org/\">"
                +"<input>"
                +wsdlParam
                +"</input>"
                +"  </"+httpMethod+">"
                +" </soap:Body>"
                +"</soap:Envelope>";
        try {
            URL wsUrl = new URL(baseUrl);

            HttpURLConnection conn = (HttpURLConnection) wsUrl.openConnection();

            conn.setConnectTimeout(100000);
            conn.setReadTimeout(100000);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
            conn.setRequestProperty("SOAPAction", "http://tempuri.org/"+httpMethod);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(new Date()));
            OutputStream os = conn.getOutputStream();

            os.write(soap.getBytes());

            InputStream is = conn.getInputStream();

            ByteArrayOutputStream arrayBuffer = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int len = -1;
            while ((len = is.read(b)) != -1) {
                arrayBuffer.write(b, 0, len);
            }

            is.close();
            os.close();
            conn.disconnect();

            return new String(arrayBuffer.toByteArray(), "UTF-8");
        } catch (Exception e) {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(new Date()));
            e.printStackTrace();
        }
        return null;
    }

    public static String httpPost(String baseUrl,String httpMethod,String wsdlParam){

        String soap="<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                +" <soap:Header>"
                +" <MySoapHeader xmlns=\"http://tempuri.org/\">"
                +" <Sign></Sign>"
                +"<Time></Time>"
                +" </MySoapHeader>"
                +" </soap:Header>"
                +" <soap:Body>"
                +"  <"+httpMethod+" xmlns=\"http://tempuri.org/\">"
                +"<request>"
                +wsdlParam
                +"</request>"
                +"  </"+httpMethod+">"
                +" </soap:Body>"
                +"</soap:Envelope>";
        try {
            URL wsUrl = new URL(baseUrl);

            HttpURLConnection conn = (HttpURLConnection) wsUrl.openConnection();

            conn.setConnectTimeout(100000);
            conn.setReadTimeout(100000);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
            conn.setRequestProperty("SOAPAction", "http://tempuri.org/"+httpMethod);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(new Date()));
            OutputStream os = conn.getOutputStream();

            os.write(soap.getBytes());

            InputStream is = conn.getInputStream();

            ByteArrayOutputStream arrayBuffer = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int len = -1;
            while ((len = is.read(b)) != -1) {
                arrayBuffer.write(b, 0, len);
            }

            is.close();
            os.close();
            conn.disconnect();

            return new String(arrayBuffer.toByteArray(), "UTF-8");
        } catch (Exception e) {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(new Date()));
            e.printStackTrace();
        }
        return null;
    }

    public static String httpGet(String baseUrl, String httpMethod){
        String soap="<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                +" <soap:Header>"
                +" <MySoapHeader xmlns=\"http://tempuri.org/\">"
                +" <Sign></Sign>"
                +"<Time></Time>"
                +" </MySoapHeader>"
                +" </soap:Header>"
                +" <soap:Body>"
                +"  <"+httpMethod+" xmlns=\"http://tempuri.org/\" />"
                +" </soap:Body>"
                +"</soap:Envelope>";
        try {
            URL wsUrl = new URL(baseUrl);

            HttpURLConnection conn = (HttpURLConnection) wsUrl.openConnection();

            conn.setConnectTimeout(100000);
            conn.setReadTimeout(100000);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
            conn.setRequestProperty("SOAPAction", "http://tempuri.org/"+httpMethod);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(new Date()));
            OutputStream os = conn.getOutputStream();

            os.write(soap.getBytes());

            InputStream is = conn.getInputStream();

            ByteArrayOutputStream arrayBuffer = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int len = -1;
            while ((len = is.read(b)) != -1) {
                arrayBuffer.write(b, 0, len);
            }

            is.close();
            os.close();
            conn.disconnect();

            return new String(arrayBuffer.toByteArray(), "UTF-8");
        } catch (Exception e) {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(new Date()));
            e.printStackTrace();
        }
        return null;
    }


}
