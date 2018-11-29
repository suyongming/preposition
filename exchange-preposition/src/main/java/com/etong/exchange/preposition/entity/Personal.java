package com.etong.exchange.preposition.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 
 * 
 * @date 2018-11-13
 */
public class Personal {
    private String id;
    /**
     * 姓名
     */
    private String name;

    private String identity;

    /**
     * 证件类型，0：身份证
     */
    private Long identityType;

    /**
     * 婚姻标识，0：不限；1：未婚；2：已婚
     */
    private Long marital;

    /**
     * 性别，0：不限；1：男；2：女
     */
    private Long gender;

    private Long age;

    /**
     * 生日
     */
    private Timestamp birthDate;

    /**
     * 联系手机
     */
    private String phone;

    private Timestamp createTime;

    private Timestamp updateTime;

    /**
     * 地址
     */
    private String address;

    /**
     * 机构代码
     */
    private String institutionCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Long getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Long identityType) {
        this.identityType = identityType;
    }

    public Long getMarital() {
        return marital;
    }

    public void setMarital(Long marital) {
        this.marital = marital;
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode == null ? null : institutionCode.trim();
    }
}