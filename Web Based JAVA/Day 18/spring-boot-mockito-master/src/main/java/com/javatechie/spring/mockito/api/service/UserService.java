package com.javatechie.spring.mockito.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.mockito.api.dao.UserRepository;
import com.javatechie.spring.mockito.api.model.MyUser;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	

	public MyUser addUser(MyUser user) {
		return repository.save(user);
	}

	public List<MyUser> getUsers() {
		List<MyUser> users = repository.findAll();
		System.out.println("Getting data from DB : " + users);
		return users;
	}

	public List<MyUser> getUserbyAddress(String address) {
		return repository.findByAddress(address);
	}

	public void deleteUser(MyUser user) {
		repository.delete(user);
	}
}
