package com.etong.exchange.preposition.util;

public class Page {

	private Integer page = 1;

	private Integer size = 10;

	private Integer total;

	private Integer startNo;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getStartNo() {
		this.startNo = (this.page - 1) * size;
		return this.startNo;
	}

	public void setStartNo(Integer startNo) {
		this.startNo = startNo;
	}

}
