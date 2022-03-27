package com.example.demo.infra.order.assembler;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.infra.order.bo.CreateOrderBo;
import com.example.demo.infra.order.bo.OrderBo;
import com.example.demo.infra.order.po.Order;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@Mapper(componentModel = "spring")
public interface OrderFactory {

	/**
	 * entity转为bo
	 */
	OrderBo entityToBo(Order order);
	
	/**
	 *
	 */
	List<OrderBo> entitysToBos(List<Order> orders);

	/**
	 * bo转entity
	 *
	 * @param userBo 业务对象
	 * @return User 用户实体
	 */
	Order boToEntity(OrderBo userBo);
	
	/**
	 *
	 * @param userBo
	 * @return
	 */
	List<Order> bosToEntitys(List<OrderBo> userBo);
	
	OrderBo createOrderBoToOrderBo(CreateOrderBo createOrderBo);
	
}
