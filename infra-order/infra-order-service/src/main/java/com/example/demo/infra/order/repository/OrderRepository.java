package com.example.demo.infra.order.repository;

import com.example.demo.infra.order.mapper.OrderMapper;
import com.example.demo.infra.order.po.Order;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@Service
public class OrderRepository extends ServiceImpl<OrderMapper, Order> {

}