package com.example.cat.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CatAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatAuthApplication.class, args);
	}

}
