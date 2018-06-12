package com.drore.cloud.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class IotConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotConfigServerApplication.class, args);
	}
}
