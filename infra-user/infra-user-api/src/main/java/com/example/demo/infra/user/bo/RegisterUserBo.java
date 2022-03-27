package com.example.demo.infra.user.bo;

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
public class RegisterUserBo {
	private String username;
	private String password;
	private String tel;
}
