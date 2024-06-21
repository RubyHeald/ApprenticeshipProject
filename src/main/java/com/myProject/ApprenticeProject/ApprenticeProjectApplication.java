package com.myProject.ApprenticeProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) //Error on serve, AutoCongfig added to correct
@SpringBootApplication
public class ApprenticeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprenticeProjectApplication.class, args);
	}

}
