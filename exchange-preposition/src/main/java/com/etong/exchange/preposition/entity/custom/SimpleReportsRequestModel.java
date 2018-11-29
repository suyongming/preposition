package com.etong.exchange.preposition.entity.custom;

import lombok.Data;

@Data
public class SimpleReportsRequestModel {
    private String identity;
//    private String
    private String identityType;

    private String name;

    private String mobile;
}
