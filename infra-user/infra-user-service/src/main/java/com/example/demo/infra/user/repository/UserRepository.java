package com.example.demo.infra.user.repository;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.infra.user.mapper.UserMapper;
import com.example.demo.infra.user.po.User;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@Service
public class UserRepository extends ServiceImpl<UserMapper, User> {

}