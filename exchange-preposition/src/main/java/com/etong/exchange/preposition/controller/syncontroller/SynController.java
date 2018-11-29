package com.etong.exchange.preposition.controller.syncontroller;

import com.etong.exchange.preposition.entity.*;
import com.etong.exchange.preposition.enums.Constants;
import com.etong.exchange.preposition.service.SynService;
import com.etong.exchange.preposition.service.custom.PrepositionService;
import com.etong.exchange.preposition.util.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/preposition")
public class SynController {

    @Autowired
    private SynService synService;

    @Autowired
    private PrepositionService prepositionService;

    @GetMapping("/mec/packages")
    public ResultBean<List<MedicalPackage>> readRemotePackages(){
        ResultBean<List<MedicalPackage>> resultBean = new ResultBean();
        List<MedicalPackage> httpPackageList= synService.readRemotePackages();
        prepositionService.updateRemotePackages(httpPackageList);
        resultBean.setData(httpPackageList);
        return resultBean;
    }

    @GetMapping("/mec/items")
    public ResultBean<List<MedicalItemCategory>> readRemoteItemsAndCateGroy(){
        ResultBean<List<MedicalItemCategory>> resultBean = new ResultBean();

        List<MedicalItemCategory> categoryList = synService.readRemoteItems();
        prepositionService.updateRemoteItems(categoryList);
        resultBean.setData(categoryList);
        return resultBean;
    }

    @PostMapping(value = "mec/person/appointments")
    @ResponseBody
    public ResultBean<PersonalAppointment> savePersonalAppointment(@RequestBody PersonalAppointment appointment) {
        ResultBean<PersonalAppointment> resultBean = new ResultBean<PersonalAppointment>();
        //等中山通了再开
        PersonalAppointment appointmentReuslt = synService.savePersonalAppointment(appointment);
        prepositionService.savePersonalAppointment(appointmentReuslt);
        resultBean.setData(appointmentReuslt);
        return resultBean;
    }

    @PostMapping(value = "mec/person/appointments/cancel")
    @ResponseBody
    public ResultBean<PersonalAppointment> cancelPersonalAppointment(@RequestBody PersonalAppointment appointment) {
        ResultBean<PersonalAppointment> resultBean = synService.cancelPersonalAppointment(appointment);

        if(Constants.DEFAULT_SUCCESS.getCode().equals(resultBean.getCode())) {
            prepositionService.cancelPersonalAppointment(appointment);
        }
        return resultBean;

    }

    //获取 获取体检记录
    @GetMapping(value = "mec/simpleReports")
    @ResponseBody
    public ResultBean<List<MedicalReport>> getSimpleReports(String identity, String name, String mobile, String startDate, String endDate) {
        return synService.getSimpleReports(identity, name, mobile, startDate, endDate);

    }

    //mec/reports 256 获取体检报告
    @GetMapping(value = "mec/reports")
    @ResponseBody
    public ResultBean<List<MedicalReport>> getReports(String identity, String name, String mobile, String examNo) {
        ResultBean<List<MedicalReport>> resultBean = synService.getReports(identity, name, mobile, examNo);

        prepositionService.updateRemoteReports(resultBean.getData());

        return resultBean;

    }
}
