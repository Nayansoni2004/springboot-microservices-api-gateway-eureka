package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class M7EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(M7EurekaServerApplication.class, args);
	}

}
