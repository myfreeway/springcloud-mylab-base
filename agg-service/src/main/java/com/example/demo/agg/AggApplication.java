package com.example.demo.agg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.example.demo"})
public class AggApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggApplication.class, args);
	}

}
