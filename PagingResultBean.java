package com.ssw.demo.commen.page;

public class PagingResultBean<T> {

	private PagingInfo pageInfo;
	private T result;
	public PagingInfo getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PagingInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	
	
}
