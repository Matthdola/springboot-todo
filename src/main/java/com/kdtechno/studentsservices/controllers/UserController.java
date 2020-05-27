package com.kdtechno.studentsservices.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kdtechno.studentsservices.models.User;
import com.kdtechno.studentsservices.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "http:localhost:4200")
public class UserController {
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
}
