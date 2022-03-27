package com.example.demo.infra.risk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InfraRiskApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraRiskApplication.class, args);
	}

}
