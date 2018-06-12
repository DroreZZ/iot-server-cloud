package com.drore.cloud.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IotCenterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotCenterServiceApplication.class, args);
	}
}
