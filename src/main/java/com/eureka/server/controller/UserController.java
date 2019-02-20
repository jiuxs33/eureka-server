package com.eureka.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.server.dao.UserRepository;
import com.eureka.server.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		
		User user = this.repository.findById(id).get();
		return user;
	}
}
