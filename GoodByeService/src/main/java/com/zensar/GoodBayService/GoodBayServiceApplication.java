package com.zensar.GoodBayService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class GoodBayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodBayServiceApplication.class, args);
	}
	@GetMapping
	public String sayHello()
	{
		return "<h1>GoodBye!!!</h1>";
	}

}
