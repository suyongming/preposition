package com.etong.exchange.preposition.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class MedicalPreposition {

    private String id;

    private Integer institutionCode;

    private String baseUrl;

    private Timestamp createTime;

    private Timestamp updateTime;

}
