package com.etong.exchange.preposition.entity.custom;


import lombok.Data;

@Data
public class MedicalPackageDTO {
    private String id;

    private String institutionCode;

    private String code;

    private String name;

    private String price;

    private Integer gender;

    private Integer marital;

    private String suit;

    private String description;

    private String remark;

    private String avatar;

    private String notice;

    private Integer delFlag;

}
