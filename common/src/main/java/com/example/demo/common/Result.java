package com.example.demo.common;

import com.example.demo.common.CommCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@Data
@EqualsAndHashCode
public class Result<T> implements Serializable {
	private Integer code;
	private String msg;
	private T data;
	
	public Result() {
		super();
	}
	
	public Result(T data) {
		this.code = CommCode.SUCCESS.getCode();
		this.data = data;
	}
	
	public boolean isSuccess() {
		return CommCode.SUCCESS.getCode().equals(this.code);
	}
}
