package com.etong.exchange.preposition.controller;

import com.etong.exchange.preposition.dao.MedicalPrepositionModelMapper;
import com.etong.exchange.preposition.entity.MedicalPreposition;
import com.etong.exchange.preposition.service.SMSService;
import com.etong.exchange.preposition.service.SynService;
import com.etong.exchange.preposition.service.impl.SynServiceImpl;
import com.etong.exchange.preposition.util.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/preposition")
public class MedicalPrepositionController {

    @Autowired
    private SMSService smsService;
    /**
     * 生成所有模板模板
     * */
    @PutMapping("/model/pull")
    public ResultBean<MedicalPreposition> synPrepositionModel(){
        //1一个请求就可以或得到所有模板
        //2编辑后，系统全局都知道最新的模板配置
        ResultBean<MedicalPreposition> resultBean = new ResultBean();
        Method[] methods = SynServiceImpl.class.getDeclaredMethods();

        return resultBean;
    }


    /**
     * 短信接口
     * */
    @GetMapping("/sms/sendSMS")
    public ResultBean<Map<String,String>> sendSmsMsg(String phone, String content){

        return smsService.sendSmsMsgMedicalInstitution(phone,content);
    }

}
