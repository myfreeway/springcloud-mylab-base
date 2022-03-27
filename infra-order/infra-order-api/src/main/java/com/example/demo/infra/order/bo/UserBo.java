package com.example.demo.infra.order.bo;

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
public class UserBo {
	private Long id;
	private String username;
	private String password;
	private String tel;
}
