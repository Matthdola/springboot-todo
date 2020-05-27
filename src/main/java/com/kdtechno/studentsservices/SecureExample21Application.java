package com.kdtechno.studentsservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kdtechno.studentsservices")
public class SecureExample21Application {

	public static void main(String[] args) {
		SpringApplication.run(SecureExample21Application.class, args);
	}

}
