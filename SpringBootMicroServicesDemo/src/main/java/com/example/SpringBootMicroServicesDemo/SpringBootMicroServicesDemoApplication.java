package com.example.SpringBootMicroServicesDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages="com.example")
public class SpringBootMicroServicesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServicesDemoApplication.class, args);
	}

}
