package com.etong.exchange.preposition.entity;

import com.etong.exchange.preposition.entity.custom.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MedicalItem  extends BaseModel{

//	@JsonProperty("Code")
	private String code;

//	@JsonProperty("Gender")
	private String gender;

//	@JsonProperty("Id")
	private String id;

//	@JsonProperty("Marital")
	private String marital;

//	@JsonProperty("Name")
	private String name;

//	@JsonProperty("Price")
	private String price;
	//临床
//	@JsonProperty("Selected")
	private Integer selected;

//	@JsonProperty("Suit")
	private String suit;

	//详细说明
//	@JsonProperty("Description")
	private String description;

	//备注信息
//	@JsonProperty("Remark")
	private String remark;

	private Integer itemShow;//加项预约显示：0：显示；1：不显示

	private Integer itemPriceShow;//项目价格显示：0：显示；1：不显示
	private Integer projectShow;//项目显示：0：显示；1：不显示
//	private Integer isPop; //是否弹窗：0：显示；1：不显示

	private String popText;
	private String aliasName;// 别名
	private Integer sort;// 序号



}
