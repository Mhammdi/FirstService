package com.vision.riad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FirstSericeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSericeApplication.class, args);
	}

}
