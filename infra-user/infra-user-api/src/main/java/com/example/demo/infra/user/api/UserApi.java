package com.example.demo.infra.user.api;

import com.example.demo.common.Result;
import com.example.demo.common.TableDataInfo;
import com.example.demo.infra.user.bo.PageQueryUserBo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.infra.user.bo.RegisterUserBo;
import com.example.demo.infra.user.bo.UserBo;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@FeignClient(value = "infra-user-service")
public interface UserApi {
	@GetMapping("/getUserById")
	public Result<UserBo> getUserById(@RequestParam("userId") Long userId);
	
	@PostMapping("/page")
	public Result<TableDataInfo<UserBo>> page(@RequestBody PageQueryUserBo PageQueryUserBo);
	
	@PostMapping("/register")
	public Result<UserBo> register(@RequestBody RegisterUserBo registerUserBo);
}
