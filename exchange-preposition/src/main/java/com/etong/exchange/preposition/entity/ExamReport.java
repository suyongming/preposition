package com.etong.exchange.preposition.entity;

import com.etong.exchange.preposition.entity.custom.BaseModel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ExamReport extends BaseModel {
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

	private String checkpoint;// 检查部位

	private String method;// 检查方法

	private String finding;// 检查所见

	private String conclusion;// 检查结论

	private String images;// 检查影像
	
	private String departmentCode;//科室代码
	
	private String departmentName;//科室名称
	
	private List<LabIndex> labIndexs;//体检指标

}
