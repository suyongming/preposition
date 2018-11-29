package com.etong.exchange.preposition.service;

import com.etong.exchange.preposition.util.ResultBean;

public interface SMSService {


    ResultBean sendSmsMsgMedicalInstitution(String phone, String content);
}
