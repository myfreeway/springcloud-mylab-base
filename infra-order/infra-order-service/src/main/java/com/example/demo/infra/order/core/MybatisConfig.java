package com.example.demo.infra.order.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
@Configuration
public class MybatisConfig {
	/**
	 * 分页插件，自动识别数据库类型【不配置默认不生效】 https://baomidou.com/guide/interceptor-pagination.html
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
		// 设置数据库类型为mysql
		paginationInterceptor.setDbType(DbType.MYSQL);
		// 设置最大单页限制数量，默认 500 条，-1 不受限制
		paginationInterceptor.setLimit(-1);
		return paginationInterceptor;
	}
}
