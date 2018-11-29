package com.etong.exchange.preposition.entity;

import com.etong.exchange.preposition.entity.custom.BaseModel;
import lombok.Data;

@Data
public class LabIndex extends BaseModel {
	private String examNo;// 体检编号

	private String reportNo;// 报告单号

	private String indexCode;// 检验指标代码

	private String indexName;// 检验指标名称

	private String indexResult;// 检验指标结果

	private String referenceRange;// 参考值范围

	private String measureUnit;// 计量单位

	private String unusualPrompt;// 异常提示
	
	private String examOpinion;//检查意见
	
	private String departmentCode;//科室代码
	
	private String departmentName;//科室名称

	@Override
	public String toString() {
		return "LabIndex [examNo=" + examNo + ", reportNo=" + reportNo + ", indexCode=" + indexCode + ", indexName="
				+ indexName + ", indexResult=" + indexResult + ", referenceRange=" + referenceRange + ", measureUnit="
				+ measureUnit + ", unusualPrompt=" + unusualPrompt + ", examOpinion=" + examOpinion
				+ ", departmentCode=" + departmentCode + ", departmentName=" + departmentName + "]";
	}
	
	

}
