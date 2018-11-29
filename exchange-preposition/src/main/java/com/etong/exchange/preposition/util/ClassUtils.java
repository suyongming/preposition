package com.etong.exchange.preposition.util;


import java.util.HashMap;
import java.util.Map;

public class ClassUtils {

    /**
     * 获取调用的类名
     *
     * @return String
     */
    public static String getClassName() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[2];
        String className = e.getClassName();
        return className;
    }

    /**
     * 获取调用的方法名
     *
     * @return String
     */
    public static String getMethodName() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[2];
        String methodName = e.getMethodName();
        return methodName;
    }

    public static String getFileName() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[2];
        String methodName = e.getFileName();
        return methodName;
    }

    public static int getLineNumber() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[2];
        int line = e.getLineNumber();
        return line;
    }

    public static void main(String[] args) {
//        MedicalPrepositionModel model = new MedicalPrepositionModel();
        Map<String,String> httpResult = new HashMap<>();

        String str = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><GetTJTCResponse xmlns=\"http://tempuri.org/\"><GetTJTCResult>{\"code\":\"0000\",\"data\":{\"name\":\"张三\"}}</GetTJTCResult></GetTJTCResponse></soap:Body></soap:Envelope>";
        String regex2 = "<(.*?)>(.*?)</.*?>";
        int startIndex = "<GetTJTCResponse xmlns=\"http://tempuri.org/\">".length();
        String result =  str.substring(str.indexOf("<GetTJTCResponse xmlns=\"http://tempuri.org/\">")+startIndex,str.indexOf("</GetTJTCResponse>"));
        Map<String,String> mapResult = DocumentUtil.getDataContext(result);
        System.out.println(mapResult.toString());
        //        Pattern compile = Pattern.compile(regex2);
//        Matcher matcher = compile.matcher(str);
//        while(matcher.find()){
//            httpResult.put(matcher.group(1),matcher.group(2));
//        }





        System.out.println("当前运行的类："+getClassName());
        System.out.println("当前执行的方法："+getMethodName());
        System.out.println("当前文件名："+getFileName());
        System.out.println("当前执行的行数："+getLineNumber());


    }



}
