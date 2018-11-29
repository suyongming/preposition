package com.etong.exchange.preposition.entity;


import com.etong.exchange.preposition.entity.custom.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MedicalPackage extends BaseModel {

//	@JsonProperty("Id")
	private String id;

//	@JsonProperty("Code")
	private String code;

//	@JsonProperty("Name")
	private String name;

//	@JsonProperty("Price")
	private String price;

//	@JsonProperty("Gender")
	private Integer gender;

//	@JsonProperty("Marital")
	private Integer marital;

//	@JsonProperty("Suit")
	private String suit;

//	@JsonProperty("Description")
	private String description;

//	@JsonProperty("Remark")
	private String remark;

//	@JsonProperty("Avatar")
	private String avatar;

//	@JsonProperty("items")
	private List<MedicalItem> items;

//	@JsonProperty("Notice")
	private String notice;

//	@JsonProperty("DelFlag")
	private Integer delFlag;

}
