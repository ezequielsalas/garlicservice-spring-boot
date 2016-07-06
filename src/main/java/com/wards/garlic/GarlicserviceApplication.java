package com.wards.garlic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoAuditing
public class GarlicserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarlicserviceApplication.class, args);
	}
}
