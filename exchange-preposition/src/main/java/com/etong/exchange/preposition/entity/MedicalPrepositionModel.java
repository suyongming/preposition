package com.etong.exchange.preposition.entity;

import java.util.Date;

/**
 *
 * @date 2018-11-16
 */
public class MedicalPrepositionModel {
    private Integer id;

    /**
     * 本地方法名称
     */
    private String methodName;

    /**
     * 请求模板
     */
    private String requestModelCode;

    /**
     * 响应模板
     */
    private String responseModelCode;

    private Date createTime;

    private Date updateTime;

    /**
     * 体检机构代码
     */
    private String institutionCode;

    /**
     * 模型名称(entry)
     */
    private String modelName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public String getRequestModelCode() {
        return requestModelCode;
    }

    public void setRequestModelCode(String requestModelCode) {
        this.requestModelCode = requestModelCode == null ? null : requestModelCode.trim();
    }

    public String getResponseModelCode() {
        return responseModelCode;
    }

    public void setResponseModelCode(String responseModelCode) {
        this.responseModelCode = responseModelCode == null ? null : responseModelCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode == null ? null : institutionCode.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }
}