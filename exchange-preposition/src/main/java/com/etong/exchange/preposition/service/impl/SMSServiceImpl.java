package com.etong.exchange.preposition.service.impl;

import com.etong.exchange.preposition.service.SMSService;
import com.etong.exchange.preposition.util.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class SMSServiceImpl implements SMSService {


    @Value("${SMS.HOST}")
    private String SMS_HOST;

    @Value("${SMS.ACCOUNTID}")
    private String SMS_ACCOUNTID;

    @Value("${SMS.PASSWORD}")
    private String SMS_PASSWORD;


    @Override
    public ResultBean sendSmsMsgMedicalInstitution(String phone, String content) {
        ResultBean<Map<String,String>> resultBean = new ResultBean();
        int port = 9981;
        String host = SMS_HOST;
        String accountId = SMS_ACCOUNTID;
        String password = SMS_PASSWORD;
        String serviceId = SMS_ACCOUNTID;





        return resultBean;
    }


}
