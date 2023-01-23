package com.portfoliomanagement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.portfoliomanagement.entity.User;
import com.portfoliomanagement.repository.UserRepository;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.portfoliomanagement.repository")
//@EntityScan(basePackages = "com.portfoliomanagement.entity")
//@ComponentScan(basePackages = "com.portfoliomanagement.controller, com.portfoliomanagement.service, com.portfoliomanagement.util, com.portfoliomanagement.config")
public class AuthenticationApplication {

	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101, "user1", "pass1", "e1@mail.com"),
				new User(102, "user2", "pass2", "e2@mail.com"),
				new User(103, "user3", "pass3", "e3@mail.com")
				).collect(Collectors.toList());
		userRepository.saveAll(users);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(AuthenticationApplication.class, args);
		/*for(String nm:ctx.getBeanDefinitionNames()) {
			System.out.println(nm);
		}*/
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	

}
