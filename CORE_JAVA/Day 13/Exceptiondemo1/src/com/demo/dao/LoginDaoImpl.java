package com.demo.dao;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

import com.demo.exceptions.WrongCredentialException;

public class LoginDaoImpl implements LoginDao {
	static Map<String,String> logindetails;
	static {
		logindetails=new HashMap<>();
		logindetails.put("user1", "user1");
		logindetails.put("user2", "user2");
		logindetails.put("user3", "user3");
		
	}
	@Override
	public boolean addnewUserDetails(String uname, String pass) throws WrongCredentialException {
		try {
			if(!logindetails.containsKey(uname)) {
				logindetails.put(uname, pass);
				return true;
			}
			throw new WrongCredentialException("Wrong creadential");
		}catch(WrongCredentialException e) {
			System.out.println("handling in dao layer");
			throw e;
		}
	}
	@Override
	public boolean validateuserDetails(String uname, String pass) {
		String p=logindetails.get(uname);
		if(p!=null && p.equals(pass)) {
			return true;
		}
		throw new InputMismatchException("credentials are wrong");
	}

}
