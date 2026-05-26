package com.vcube.empservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class EmployeeConfig {
	
	@Bean
	ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public WebClient getWebClient() {
		return  WebClient.builder()
				.baseUrl("http://localhost:8082")
				.build();
	}
}
