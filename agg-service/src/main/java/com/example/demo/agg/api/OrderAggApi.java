package com.example.demo.agg.api;

import com.example.demo.infra.risk.api.RiskApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.CommCode;
import com.example.demo.common.Result;
import com.example.demo.infra.order.api.OrderApi;
import com.example.demo.infra.order.bo.CreateOrderBo;
import com.example.demo.infra.order.bo.OrderBo;
import com.example.demo.infra.risk.bo.CheckResultParamBo;
import com.example.demo.infra.risk.bo.CheckRiskResultBo;
import com.example.demo.infra.user.api.UserApi;
import com.example.demo.infra.user.bo.UserBo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderAggApi {
	@Autowired
	private RiskApi riskApi;
	@Autowired
	private OrderApi orderApi;
	@Autowired
	private UserApi userApi;

	@PostMapping("/createOrder")
	public Result<OrderBo> createOrder(@RequestBody CreateOrderBo createOrderBo) {
		log.info("createOrder入参={}", createOrderBo);
		Result<OrderBo> result = new Result<>();
		Result<UserBo> user = userApi.getUserById(createOrderBo.getUserId());
		if (user == null || user.getData() == null) {
			result.setCode(CommCode.DATA_IS_WRONG.getCode());
			result.setMsg("用户不存在");
			log.info("createOrder回参={}", result);
			return result;
		}

		CheckResultParamBo checkResultParamBo = new CheckResultParamBo();
		checkResultParamBo.setReceiverAddr(createOrderBo.getReceiverAddr());
		checkResultParamBo.setReceiverTel(createOrderBo.getReceiverTel());
		checkResultParamBo.setUserId(createOrderBo.getUserId());
		Result<CheckRiskResultBo> checkRiskResultBo = riskApi.checkRisk(checkResultParamBo);
		if (checkRiskResultBo == null || checkRiskResultBo.getData() == null
				|| checkRiskResultBo.getData().getRisk() == false) {
			result.setCode(CommCode.INTFR_FORBID_VISIT.getCode());
			result.setMsg("存在风控风险，限制访问");
			log.info("createOrder回参={}", result);
			return result;
		}
		Result<OrderBo> orderBo = orderApi.createOrder(createOrderBo);
		result = orderBo;
		log.info("createOrder回参={}", result);
		return result;
	}
	
	@Autowired
	private DiscoveryClient discoveryClient; //服务发现客户端
	
	@GetMapping(value = "/test")
	public Integer test() {
		log.info("discoveryClient.getServices()={}", discoveryClient.getServices());
		log.info("discoveryClient.getInstances()={}", discoveryClient.getInstances("infra-user-service"));
		return 1;
	}
}
