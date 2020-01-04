package com.aml.loginservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aml.loginservice.model.User;
import com.aml.loginservice.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void saveUser() {
		List<User> users = new ArrayList<>();
		users.add(new User(001, "Mrinal", "banana12", "email@gmail.com", "0123456789"));
		repository.saveAll(users);
	}
	
	@GetMapping(value="/getAllUsers",produces={"application/json"})
//	@GetMapping(value="/getAllUsers")
	public List<User> getUsers() {
		return repository.findAll();
	}
	@GetMapping("/getById/{id}")
	public List<User> getById(@PathVariable("id") int id) {
		return repository.findByUserid(id);
	}
}
