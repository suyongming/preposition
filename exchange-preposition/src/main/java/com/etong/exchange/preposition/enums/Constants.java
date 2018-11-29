package com.etong.exchange.preposition.enums;

public enum Constants {
	
	GENERAL_INSTITUTION_CODE("00000", "通用医院代码"),
	V2GENERAL_INSTITUTION_CODE("20000", "V2.0通用医院代码"),

	DEFAULT_SUCCESS("0000", "处理成功 "), 
	DEFAULT_ERROR("0001", "处理失败"),
	
	LACK_PARAMS("0002", "缺少参数"),
	DATE_FORMAT_ERROR("0003", "日期格式错误"),
	PARAM_VALUE_ERROR("0004", "参数取值错误"),
	UNAUTHORIZED_OPERATION("0005", "当前用户无权操作"),
	INVALID_ID_CARD("0006", "无效的身份证"),
	INSTITUTION_EXISTS("0007", "添加的机构代码已存在"),
	METHOD_NOT_IMPLEMENTED("0008", "请求的方法尚未实现"),
	LOGIN_FAIL_EXCEED_FIVE_LIMIT("0009", "登录失败超过5次，账号自动被锁定5分钟"),
	SEND_SMS_EXCEED_FIVE_LIMIT("0010", "发送短信验证码超过5次，账号自动锁定5分钟"),
	CANNOT_APPOINT_WHEN_EXPENSE_LESS_THAN("0011", "体检费用小于%s不能提交"),

	EMPTY_TOKEN("1000", "token不能为空"),
	INVALID_TOKEN("1001", "token已失效，请重新登录"),
	MOBILE_REGISTED("1002", "该手机号已被注册"),
	MOBILE_NOT_REGISTED("1003", "该手机号尚未被注册"),
	LOGIN_FAIL("1004", "用户名密码错误，请重试"),
	INVALID_VERIFY_CODE("1005", "无效的验证码"),
	RESET_WITH_SAME_PASSWORD("1006", "新密码和原密码一致，请重新输入"),
	EXCEED_EQUIPMENT_LIMIT("1007", "超过设备每日预约数量限制"),
	ACCOUNT_REGISTED("1008", "此账号已存在"),
	ADD_DUPLICATE_CODE("1009", "不可以添加重复的代码"),
	USER_NOT_REGIST("1010", "用户暂未注册"),
	;
	
	
	private String code;
	private String msg;

	Constants(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public static String getMsg(String code) {
		for (Constants errorEnum : Constants.values()) {
			if (errorEnum.getCode().equals(code)) {
				return errorEnum.msg;
			}
		}
		return null;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
