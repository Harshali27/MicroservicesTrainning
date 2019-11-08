package com.zensar.WeatherService;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class WeatherServiceApplication {

	String[] weather = {"rainy","sunny","windy","cloudy"};
	public static void main(String[] args) {
		SpringApplication.run(WeatherServiceApplication.class, args);
	}

	@GetMapping("/current/weather")
	public String getWeather()
	{
		int random = ThreadLocalRandom.current().nextInt(0,4);
		return weather[random];
		
	}
}
