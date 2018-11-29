package com.etong.exchange.preposition.util;

import com.etong.exchange.preposition.enums.Constants;

import java.io.Serializable;
import java.util.Date;

public class ResultBean<S> implements Serializable {

	private static final long serialVersionUID = 4840057545047078824L;

	private String code;
	private String msg;
	private S data;
	private Page page;
	private String systemTime = StringUtil.getDateStr(null, new Date());

	public ResultBean() {
		this.code = Constants.DEFAULT_SUCCESS.getCode();
		this.msg = Constants.getMsg(code);
	}

	public ResultBean(String code) {
		init(code);
	}

	public ResultBean(String code, S data) {
		init(code, data, null);
	}

	public ResultBean(String code, S data, Page page) {
		init(code, data, page);
	}

	public ResultBean<S> init(String code) {
		return init(code, null, null);
	}

	public ResultBean<S> init(String code, S data, Page page) {
		this.code = code;
		this.data = data;
		this.page = page;
		this.msg = Constants.getMsg(code);

		return this;
	}

	public ResultBean<S> init(String code, String msg, S data, Page page) {
		this.code = code;
		this.data = data;
		this.page = page;
		this.msg = msg;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public S getData() {
		return data;
	}

	public void setData(S data) {
		this.data = data;
	}

	public void setData(S data, Page page) {
		this.data = data;
		this.page = page;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
		this.msg = Constants.getMsg(code);
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getSystemTime() {
		return systemTime;
	}

	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}

}
