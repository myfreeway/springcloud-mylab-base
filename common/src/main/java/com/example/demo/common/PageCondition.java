package com.example.demo.common;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@Data
public class PageCondition {
	private int pageNum = 1;
	private int pageSize = 10;
}
