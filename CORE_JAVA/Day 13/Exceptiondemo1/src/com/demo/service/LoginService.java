package com.demo.service;

import com.demo.exceptions.WrongCredentialException;

public interface LoginService {

	boolean addNewUSer() throws WrongCredentialException ;

	boolean validateUSer(String uname, String pass) throws WrongCredentialException  ;

}
