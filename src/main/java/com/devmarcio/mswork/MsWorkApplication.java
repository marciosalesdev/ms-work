package com.devmarcio.mswork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsWorkApplication.class, args);
	}

}
