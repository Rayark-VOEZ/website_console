package com.website.thehentaidb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.website"})
public class ThehentaidbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThehentaidbApplication.class, args);
	}

}
