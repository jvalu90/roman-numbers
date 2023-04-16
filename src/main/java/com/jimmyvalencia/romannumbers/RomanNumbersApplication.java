package com.jimmyvalencia.romannumbers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RomanNumbersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RomanNumbersApplication.class, args);
	}

}
