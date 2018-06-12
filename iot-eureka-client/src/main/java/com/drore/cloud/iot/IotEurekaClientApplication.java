package com.drore.cloud.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class IotEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotEurekaClientApplication.class, args);
	}
}
