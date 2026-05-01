package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class M8ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(M8ApiGatewayApplication.class, args);
	}

}
