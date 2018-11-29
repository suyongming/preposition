package com.etong.exchange.preposition.entity;

import com.etong.exchange.preposition.entity.custom.BaseModel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LabReport extends BaseModel {
	private String examNo;// 体检编号

	private String reportNo;// 报告单号

	private String reportName;// 报告名称

	private String examDoctorCode;// 检查医生代码

	private String examDoctorName;// 检查医生名称

	private String examTime;// 检查时间

	private String reportDoctorCode;// 报告医生代码

	private String reportDoctorName;// 报告医生名称

	private String reportTime;// 报告时间

	private String verifyDoctorCode;// 审核医生代码

	private String verifyDoctorName;// 审核医生名称

	private String verifyTime;// 审核时间

	private String specimenCode;// 标本代码

	private String specimenName;// 标本名称

	private List<LabIndex> labIndexes;// 检验指标列表
	
	private String examOpinion;//检查意见
	
	private String departmentCode;//科室代码
	
	private String departmentName;//科室名称
	
	private String anormalCount;//异常指标数



}
