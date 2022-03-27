package com.example.demo.infra.user.assembler;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.infra.user.bo.UserBo;
import com.example.demo.infra.user.po.User;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@Mapper(componentModel = "spring")
public interface UserFactory {

	/**
	 * entity转为bo
	 *
	 * @param user 用户实体
	 * @return UserBo 用户业务对象
	 */
	UserBo entityToBo(User user);
	
	/**
	 *
	 * @param users
	 * @return
	 */
	List<UserBo> entitysToBos(List<User> users);

	/**
	 * bo转entity
	 *
	 * @param userBo 业务对象
	 * @return User 用户实体
	 */
	User boToEntity(UserBo userBo);
	
	/**
	 *
	 * @param userBo
	 * @return
	 */
	List<User> bosToEntitys(List<UserBo> userBo);
}
