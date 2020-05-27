package com.kdtechno.studentsservices;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.kdtechno.studentsservices.models.User;
import com.kdtechno.studentsservices.repositories.UserRepository;

@SpringBootApplication
@ComponentScan("com.kdtechno.studentsservices")
public class SecureExample21Application {

	public static void main(String[] args) {
		SpringApplication.run(SecureExample21Application.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(
					name -> {
						User user = new User(name, name.toLowerCase() + "@domain.com");
						userRepository.save(user);
						
					});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}
