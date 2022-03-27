package com.example.demo.infra.user.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.infra.user.assembler.UserFactory;
import com.example.demo.common.Result;
import com.example.demo.common.TableDataInfo;
import com.example.demo.infra.user.bo.PageQueryUserBo;
import com.example.demo.infra.user.bo.RegisterUserBo;
import com.example.demo.infra.user.bo.UserBo;
import com.example.demo.infra.user.po.User;
import com.example.demo.infra.user.repository.UserRepository;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@RestController
@Slf4j
public class UserApiImpl implements UserApi {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserFactory userFactory;

	@Override
	public Result<UserBo> getUserById(Long userId) {
		LambdaQueryWrapper<User> wrapperCondition = Wrappers.<User> lambdaQuery().eq(User::getId, userId);
		User user = userRepository.getOne(wrapperCondition);

		return new Result<>(userFactory.entityToBo(user));
	}

	@Override
	public Result<TableDataInfo<UserBo>> page(PageQueryUserBo pageQueryUserBo) {
		IPage<User> page = new Page(pageQueryUserBo.getPageNum(), pageQueryUserBo.getPageSize());
		LambdaQueryWrapper<User> wrapperCondition = Wrappers.lambdaQuery();
		wrapperCondition.likeRight(User::getTel, pageQueryUserBo.getKeyword());
		userRepository.page(page, wrapperCondition);

		TableDataInfo<UserBo> data = new TableDataInfo<>();
		data.setContent(userFactory.entitysToBos(page.getRecords()));
		data.setTotal(page.getTotal());

		return new Result<TableDataInfo<UserBo>>(data);
	}

	@Override
	public Result<UserBo> register(RegisterUserBo registerUserBo) {
		UserBo userBo = new UserBo();
		userBo.setUsername(registerUserBo.getUsername());
		userBo.setPassword(registerUserBo.getPassword());
		userBo.setTel(registerUserBo.getTel());
		User user = userFactory.boToEntity(userBo);
		userRepository.save(user);
		userBo.setId(user.getId());
		return new Result<>(userBo);
	}
	
	@Autowired
	private DiscoveryClient discoveryClient; //服务发现客户端
	
	@GetMapping(value = "/add")
	public Integer test() {
		log.info("discoveryClient.getServices()={}", discoveryClient.getServices());
		log.info("discoveryClient.getInstances()={}", discoveryClient.getInstances("infra-user-service"));
		return 1;
	}
}
