package com.example.demo.infra.user.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

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
public class User {
	@TableId(type = IdType.ASSIGN_ID)
	private Long id;
	private String username;
	private String password;
	private String tel;
}
