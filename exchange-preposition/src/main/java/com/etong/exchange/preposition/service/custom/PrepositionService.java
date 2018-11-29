package com.etong.exchange.preposition.service.custom;

import com.etong.exchange.preposition.entity.MedicalItemCategory;
import com.etong.exchange.preposition.entity.MedicalPackage;
import com.etong.exchange.preposition.entity.MedicalReport;
import com.etong.exchange.preposition.entity.PersonalAppointment;
import com.etong.exchange.preposition.util.ResultBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrepositionService {


    /**
     * 同步套餐
     * */
    boolean updateRemotePackages(List<MedicalPackage> httpPackageList);

    /**
     * 同步体检项
     * */
    boolean updateRemoteItems(List<MedicalItemCategory> httpPackageList);

    /**
     * 体检预约、登记
     * */
    boolean savePersonalAppointment(PersonalAppointment appointmentReuslt);


    /**
     * 取消预约、登记
     * @Param appointment >>examNo
     * */
    void cancelPersonalAppointment(PersonalAppointment appointment);

    /**
     * 同步获取体检记录
     * 应该持久 当前user和体检编号的关系
     * */


    /**
     * 同步体检报告
     * */
    boolean updateRemoteReports(List<MedicalReport> reports);

}
