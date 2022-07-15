package com.mhj.cart.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MhjCartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhjCartServiceApplication.class, args);
	}

}
