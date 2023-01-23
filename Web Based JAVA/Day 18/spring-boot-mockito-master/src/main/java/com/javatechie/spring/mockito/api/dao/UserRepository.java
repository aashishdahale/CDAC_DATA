package com.javatechie.spring.mockito.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.javatechie.spring.mockito.api.model.MyUser;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Integer>{
	
	List<MyUser> findByAddress(String address);

}
