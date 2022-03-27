package com.example.demo.infra.order.bo;

import com.example.demo.common.PageCondition;
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
@EqualsAndHashCode
public class PageQueryUserBo extends PageCondition {
	private String keyword;
}
