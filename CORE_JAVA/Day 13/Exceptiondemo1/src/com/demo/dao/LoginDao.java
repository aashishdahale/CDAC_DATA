package com.demo.dao;

import com.demo.exceptions.WrongCredentialException;

public interface LoginDao {

	boolean addnewUserDetails(String uname, String pass) throws WrongCredentialException;

	boolean validateuserDetails(String uname, String pass) throws WrongCredentialException;

}
