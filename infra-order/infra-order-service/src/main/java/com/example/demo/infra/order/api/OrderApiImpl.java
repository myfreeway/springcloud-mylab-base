package com.example.demo.infra.order.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Result;
import com.example.demo.infra.order.assembler.OrderFactory;
import com.example.demo.infra.order.bo.CreateOrderBo;
import com.example.demo.infra.order.bo.OrderBo;
import com.example.demo.infra.order.po.Order;
import com.example.demo.infra.order.repository.OrderRepository;

import java.util.Date;

@RestController
public class OrderApiImpl implements OrderApi {
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderFactory orderFactory;
	@Override
	public Result<OrderBo> createOrder(CreateOrderBo createOrderBo) {
		OrderBo orderBo = orderFactory.createOrderBoToOrderBo(createOrderBo);
		Order order = orderFactory.boToEntity(orderBo);
		order.setCreateTime(new Date());
		orderRepository.save(order);
		orderBo = orderFactory.entityToBo(order);
		return new Result<>(orderBo);
	}
}
