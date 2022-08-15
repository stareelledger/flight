package com.flightmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMicroApplication.class, args);
	}

	@Bean // important declaration before autowiring
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
