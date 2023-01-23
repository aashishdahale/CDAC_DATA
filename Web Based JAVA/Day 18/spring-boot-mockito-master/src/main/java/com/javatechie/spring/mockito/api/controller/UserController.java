package com.javatechie.spring.mockito.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.mockito.api.model.MyUser;
import com.javatechie.spring.mockito.api.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping(value = "/save")
	public MyUser saveUser(@RequestBody MyUser user) {
		return service.addUser(user);
	}

	@GetMapping("/getUsers")
	public List<MyUser> findAllUsers() {
		return service.getUsers();
	}

	@GetMapping("/getUserByAddress/{address}")
	public List<MyUser> findUserByAddress(@PathVariable String address) {
		return service.getUserbyAddress(address);
	}

	@DeleteMapping(value="/remove")
	public MyUser removeUser(@RequestBody MyUser user) {
		service.deleteUser(user);
		return user;
	}
}
