package com.etong.exchange.preposition.entity;

import lombok.Data;

@Data
public class PersonalAppointment extends Appointment{
    private String packageId;// 套餐ID

    private String packageCode;// 套餐代码

    private String packageName;// 套餐名称

    private MedicalPackage appointPackage;

    private String channelId;// 渠道号

}
