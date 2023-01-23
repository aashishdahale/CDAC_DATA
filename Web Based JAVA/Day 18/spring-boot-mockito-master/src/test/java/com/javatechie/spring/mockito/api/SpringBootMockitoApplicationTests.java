package com.javatechie.spring.mockito.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.javatechie.spring.mockito.api.dao.UserRepository;
import com.javatechie.spring.mockito.api.model.MyUser;
import com.javatechie.spring.mockito.api.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMockitoApplicationTests {

	//@Autowired
	@InjectMocks
	private UserService service;

	//@MockBean
	@Mock
	private UserRepository repository;

	@Test
	public void getUsersTest() {
		when(repository.findAll()).thenReturn(Stream.of(new MyUser(376, "Danile", 31, "USA"), new MyUser(958, "Huy", 35, "UK")).collect(Collectors.toList()));
		List<MyUser> ulist=service.getUsers();
		System.out.println(ulist);
		assertEquals(2, ulist.size());
	}

	@Test
	public void getUserbyAddressTest() {
		String address = "Bangalore";
		when(repository.findByAddress(address))
				.thenReturn(Stream.of(new MyUser(376, "Danile", 31, "USA")).collect(Collectors.toList()));
		assertEquals(1, service.getUserbyAddress(address).size());
	}

	@Test
	public void saveUserTest() {
		MyUser user = new MyUser(999, "Pranya", 33, "Pune");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.addUser(user));
	}

	@Ignore
	@Test
	public void deleteUserTest() {
		MyUser user = new MyUser(999, "Pranya", 33, "Pune");
		service.deleteUser(user);
		verify(repository, times(1)).delete(user);
	}

}
