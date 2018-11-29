package com.etong.exchange.preposition.entity;

import com.alibaba.fastjson.JSONArray;
import com.etong.exchange.preposition.entity.custom.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class MedicalReport extends BaseModel {

    private String examNo;// 体检编号

    private String examDate;// 体检日期

    private String reportNo;// 报告单号

    private String reportTime;// 报告时间

    private String verifyTime;// 审核时间

    private Integer identityType;// 体检人证件类型

    private String identity;// 体检人证件号码

    private String name;// 体检人姓名

    private String gender;// 体检人性别

    private String age;// 体检人年龄

    private String birthDate;// 体检人出生日期

    private String phone;// 体检人联系电话

    private String chiefDoctorCode;// 总检医生代码

    private String chiefDoctorName;// 总检医生名称

    private String verifyDoctorCode;// 审核医生代码

    private String verifyDoctorName;// 审核医生名称

    private String summary;// 体检报告综述

    private String suggestion;// 体检报告建议

    private String conclusion;// 体检报告结论

    private String healthPrescription;//保健处方

    private List<ExamReport> examReports;// 检查报告列表

    private List<LabReport> labReports;// 检验报告列表

    private String packageCode;// 套餐代码

    private String packageName;// 套餐名称

//    private JSONArray items;
    private String items;
    // 体检项目

    private String price;// 预约总价格

    private String orderNo;// 订单编号

    private String userId;// 用戶ID

    private String status;

    private String zj;//终检

    private String outReportTime;//出报告日期

}
