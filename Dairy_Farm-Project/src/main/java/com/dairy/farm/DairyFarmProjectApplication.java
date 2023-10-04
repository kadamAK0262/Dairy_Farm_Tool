package com.dairy.farm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DairyFarmProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DairyFarmProjectApplication.class, args);
	}

}
