package com.etong.exchange.preposition.entity.custom;

import com.etong.exchange.preposition.entity.ExamReport;
import com.etong.exchange.preposition.entity.LabReport;

import java.util.Date;
import java.util.List;

/**
 * 体检报告
 * 
 * @date 2018-11-13
 */
public class MedicalReportDTO {
    /**
     * 系统主键
     */
    private String id;

    /**
     * 体检编号
     */
    private String examNo;

    /**
     * 体检日期
     */
    private String examDate;

    /**
     * 报告单号
     */
    private String reportNo;

    /**
     * 报告时间
     */
    private String reportTime;

    /**
     * 审核时间
     */
    private String verifyTime;

    /**
     * 体检人证件类型
     */
    private Integer identityType;

    /**
     * 体检人证件号码
     */
    private String identity;

    /**
     * 体检人姓名
     */
    private String name;

    /**
     * 体检人性别，0：不限；1：男；2：女
     */
    private String gender;

    /**
     * 体检人年龄
     */
    private String age;

    /**
     * 体检人出生日期
     */
    private String birthDate;

    /**
     * 体检人联系电话
     */
    private String phone;

    /**
     * 总检医生代码
     */
    private String chiefDoctorCode;

    /**
     * 总检医生名称
     */
    private String chiefDoctorName;

    /**
     * 审核医生代码
     */
    private String verifyDoctorCode;

    /**
     * 审核医生名称
     */
    private String verifyDoctorName;

    /**
     * 体检报告综述
     */
    private String summary;

    /**
     * 体检报告建议
     */
    private String suggestion;

    /**
     * 体检报告结论
     */
    private String conclusion;

    /**
     * 套餐代码
     */
    private String packageCode;

    /**
     * 套餐名称
     */
    private String packageName;

    /**
     * 体检项目，体检套餐外的自选加项部分, 格式：[{code:String:项目代码, name:String:项目名称}]
     */
    private String items;

    /**
     * 机构代码
     */
    private String institutionCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 报告获取日期
     */
    private Date getReportDate;

    /**
     * 总检状态：0-未总检，1/null-已总检
     */
    private String status;

    private List<ExamReport> examReports;// 检查报告列表

    private List<LabReport> labReports;// 检验报告列表

    public List<ExamReport> getExamReports() {
        return examReports;
    }

    public void setExamReports(List<ExamReport> examReports) {
        this.examReports = examReports;
    }

    public List<LabReport> getLabReports() {
        return labReports;
    }

    public void setLabReports(List<LabReport> labReports) {
        this.labReports = labReports;
    }

    /**
     * 保健处方
     */
    private String healthPrescription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getExamNo() {
        return examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo == null ? null : examNo.trim();
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate == null ? null : examDate.trim();
    }

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime == null ? null : reportTime.trim();
    }

    public String getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(String verifyTime) {
        this.verifyTime = verifyTime == null ? null : verifyTime.trim();
    }

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getChiefDoctorCode() {
        return chiefDoctorCode;
    }

    public void setChiefDoctorCode(String chiefDoctorCode) {
        this.chiefDoctorCode = chiefDoctorCode == null ? null : chiefDoctorCode.trim();
    }

    public String getChiefDoctorName() {
        return chiefDoctorName;
    }

    public void setChiefDoctorName(String chiefDoctorName) {
        this.chiefDoctorName = chiefDoctorName == null ? null : chiefDoctorName.trim();
    }

    public String getVerifyDoctorCode() {
        return verifyDoctorCode;
    }

    public void setVerifyDoctorCode(String verifyDoctorCode) {
        this.verifyDoctorCode = verifyDoctorCode == null ? null : verifyDoctorCode.trim();
    }

    public String getVerifyDoctorName() {
        return verifyDoctorName;
    }

    public void setVerifyDoctorName(String verifyDoctorName) {
        this.verifyDoctorName = verifyDoctorName == null ? null : verifyDoctorName.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion == null ? null : suggestion.trim();
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode == null ? null : packageCode.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items == null ? null : items.trim();
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode == null ? null : institutionCode.trim();
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getGetReportDate() {
        return getReportDate;
    }

    public void setGetReportDate(Date getReportDate) {
        this.getReportDate = getReportDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getHealthPrescription() {
        return healthPrescription;
    }

    public void setHealthPrescription(String healthPrescription) {
        this.healthPrescription = healthPrescription == null ? null : healthPrescription.trim();
    }
}