package com.ssw.demo.commen.page;

public class PagingInfo {

	private Integer pageNum;
	private Integer pageSize;
	private Long total;
	private Integer pages;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
		if(this.pages == null){
			this.pages = new Double(Math.ceil((double)this.total/pageSize)).intValue();
		}
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
}
