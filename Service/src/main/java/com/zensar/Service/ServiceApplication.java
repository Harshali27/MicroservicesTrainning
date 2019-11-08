package com.zensar.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceApplication {

	@Value("${server.instace.name}")
	private String instanceName;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
	
	@GetMapping
	public String get()
	{
		return "<h1>Hello From "+instanceName+" </h1>";
		
	}

}
