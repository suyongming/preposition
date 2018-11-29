package com.etong.exchange.preposition.service;

import com.etong.exchange.preposition.entity.*;
import com.etong.exchange.preposition.util.ResultBean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SynService {

    /**
     * 同步套餐
     * */
    List<MedicalPackage> readRemotePackages();

    /**
     * 同步体检项
     * */
    List<MedicalItemCategory> readRemoteItems();

    /**
     * 体检预约、登记
     * */
    PersonalAppointment savePersonalAppointment(PersonalAppointment appointment);

    /**
     * 取消预约、登记
     * */
    ResultBean<PersonalAppointment> cancelPersonalAppointment(PersonalAppointment appointment);

    /**
     * 同步获取体检记录
     * */
    ResultBean<List<MedicalReport>> getSimpleReports(String identity, String name, String mobile, String startDate, String endDate);

    /**
     * 同步体检报告
     * */
    ResultBean<List<MedicalReport>> getReports(String identity, String name, String mobile, String examNo);

}
