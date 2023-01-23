package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.dao.AccounDaoImpl;
import com.demo.dao.AccountDao;

public class AccountServiceImpl implements AccountService {
  private AccountDao accDao;

public AccountServiceImpl() {
	super();
	this.accDao = new AccounDaoImpl();
}

@Override
public Set<Account> getAll() {
	return accDao.findAll();
}

@Override
public List<Account> getTopNAccounts(int n) {
	return accDao.findTopN(n);
}
}
