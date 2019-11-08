package com.zensar.ConfigClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	@Value("${some.property}")
	private String someProperty;
	
	@Autowired
	private ConfigClientPropertiesDemo property;
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	@GetMapping
	public String readProperty()
	{
		StringBuilder builder = new StringBuilder();
		
		builder.append(property.getProperty());
		
		builder.append(" || ");
		
		builder.append(someProperty);
		
		return builder.toString();
	}

}
