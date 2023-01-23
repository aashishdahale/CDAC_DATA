package com.demo.service;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.exceptions.WrongCredentialException;

public class LoginServiceImpl implements LoginService{
    private LoginDao ldao;
    
    
	public LoginServiceImpl() {
		ldao=new LoginDaoImpl();
	}


	@Override
	public boolean addNewUSer() throws WrongCredentialException {
		for(int i=0;i<3;i++) {
				try {
					Scanner sc=new Scanner(System.in);
					System.out.println("enter username");
					String uname=sc.next();
					System.out.println("enter password");
					String pass=sc.next();
					return ldao.addnewUserDetails(uname,pass);
				}catch(WrongCredentialException e) {
					System.out.println("handling in service layer");
					if (i==2)
					  throw e;
				}
		}
		return false;
		
		
	}


	@Override
	public boolean validateUSer(String uname, String pass) throws WrongCredentialException {
		return ldao.validateuserDetails(uname,pass);
	}

}
