package com.etong.exchange.preposition.entity;

import com.alibaba.fastjson.JSONArray;
import com.etong.exchange.preposition.entity.custom.BaseModel;
import lombok.Data;

@Data
public class Appointment extends BaseModel {

    private String userId;// 用户ID

    private Integer identityType;// 证件类型

    private String identity;// 证件号码

    private String name;// 姓名

    private String gender;// 性别

    private Integer marital;// 婚姻标识

    private String age;// 年龄

    private String birthDate;// 出生日期

    private String phone;// 联系电话

    private String appointDate;// 预约日期

    private String appointTime;// 预约时间段

    private JSONArray items;// 体检项目

    private JSONArray plusItems;// 体检加项

    private JSONArray minusItems;// 体检减项

    private String operateTime;// 预约操作时间

    private String cancelTime;// 预约取消时间

    private String price;// 预约总价格

    private String examNo;// 体检编号

    private String orderNo;// 订单编号

    private Integer status;// 预约状态

    private Integer source;// 预约来源

    private String reportId;// 体检报告ID

    private Integer type;// 0:个人预约; 1:团检预约

    private String appointName;

    private String address;//地址

    private String postcode;//邮编

    private String startDate;

    private String endDate;

}
