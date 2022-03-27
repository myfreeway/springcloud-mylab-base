package com.example.demo.infra.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.demo.infra.order.mapper")
public class InfraOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraOrderApplication.class, args);
	}

}
