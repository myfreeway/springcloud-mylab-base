package com.example.demo.infra.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.demo.infra.user.mapper")
public class InfraUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraUserApplication.class, args);
	}

}
