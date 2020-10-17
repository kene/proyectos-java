package com.spring.cloud.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CommonConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonConfigServerApplication.class, args);
	}

}
