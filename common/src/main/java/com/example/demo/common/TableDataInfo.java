package com.example.demo.common;

import java.io.Serializable;
import java.util.List;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.Convert;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
public class TableDataInfo<T> implements Serializable {
	public static TableDataInfo EMPTY = new TableDataInfo(CollUtil.newArrayList(), 0L);
	private Integer pageNum;
	private Integer pageSize;
	private Long total;
	private Integer totalPage;
	private List<T> content;

	public TableDataInfo() {
	}

	public TableDataInfo(List<T> list, long total) {
		this.content = list;
		this.total = total;
	}

	public <E> TableDataInfo<E> convertTo(Class<E> clazz) {
		List<E> eList = Convert.toList(clazz, this.content);
		TableDataInfo<E> tableDataInfo = new TableDataInfo();
		tableDataInfo.setContent(eList);
		tableDataInfo.setTotal(this.total);
		return tableDataInfo;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(final Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(final Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(final Long total) {
		this.total = total;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(final Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getContent() {
		return this.content;
	}

	public void setContent(final List<T> content) {
		this.content = content;
	}
}
