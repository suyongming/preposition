package com.etong.exchange.preposition.entity.custom;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BaseModel {
    private String id;

    public String institutionCode;

    private Timestamp createTime;

    private Timestamp updateTime;

    private String institutionName;

}
