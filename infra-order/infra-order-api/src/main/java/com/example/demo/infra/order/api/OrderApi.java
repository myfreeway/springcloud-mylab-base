package com.example.demo.infra.order.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.common.Result;
import com.example.demo.infra.order.bo.CreateOrderBo;
import com.example.demo.infra.order.bo.OrderBo;

/**
 * @Title: 订单领域服务接口
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@Tag(name = "OrderApi", description = "订单领域服务接口")
@FeignClient("infra-order-service")
public interface OrderApi {
	/**
	 * 创建订单
	 * @param createOrderBo
	 * @return
	 */
	@Operation(summary = "createOrder", description = "创建订单")
	@PostMapping("/createOrder")
	public Result<OrderBo> createOrder(@RequestBody CreateOrderBo createOrderBo);
}
