package com.ssw.demo.commen.page;

public class PagingQueryBean<T> {

	private PagingInfo pageInfo;
	private T queryBean;
	public PagingInfo getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PagingInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	public T getQueryBean() {
		return queryBean;
	}
	public void setQueryBean(T queryBean) {
		this.queryBean = queryBean;
	}
	
}
