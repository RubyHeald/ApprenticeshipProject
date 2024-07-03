package com.myProject.ApprenticeProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) //Error on serve, AutoConfig added to correct error (used Google to help)
@SpringBootApplication
public class ApprenticeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprenticeProjectApplication.class, args);
	}

}
