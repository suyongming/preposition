package com.etong.exchange.preposition.entity.custom;

import java.util.Date;

/**
 * 个人预约
 * 
 * @date 2018-11-13
 */
public class PersonalAppointmentDTO {
    /**
     * 系统主键
     */
    private String id;

    /**
     * 用户ID；用户自己网上预约时，用户ID不为空；后台管理员代为预约时，用户ID为空
     */
    private String userId;

    /**
     * 预约日期
     */
    private String appointDate;

    /**
     * 预约时间段
     */
    private String appointTime;

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
     * 预约状态，0：已预约；1：已取消
     */
    private Integer status;

    /**
     * 预约操作时间
     */
    private String operateTime;

    /**
     * 预约取消时间
     */
    private String cancelTime;

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

    private String packageId;

    private String price;

    private String examNo;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 体检加项
     */
    private String plusItems;

    /**
     * 体检减项
     */
    private String minusItems;

    /**
     * 预约来源；0/null：网上预约；1：电话预约；2：现场预约；99：其它
     */
    private Integer source;

    /**
     * 邮编
     */
    private String postcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(String appointDate) {
        this.appointDate = appointDate == null ? null : appointDate.trim();
    }

    public String getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(String appointTime) {
        this.appointTime = appointTime == null ? null : appointTime.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime == null ? null : operateTime.trim();
    }

    public String getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime == null ? null : cancelTime.trim();
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

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId == null ? null : packageId.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getExamNo() {
        return examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo == null ? null : examNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getPlusItems() {
        return plusItems;
    }

    public void setPlusItems(String plusItems) {
        this.plusItems = plusItems == null ? null : plusItems.trim();
    }

    public String getMinusItems() {
        return minusItems;
    }

    public void setMinusItems(String minusItems) {
        this.minusItems = minusItems == null ? null : minusItems.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
}