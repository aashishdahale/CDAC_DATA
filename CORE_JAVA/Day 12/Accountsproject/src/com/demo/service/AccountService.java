package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Account;

public interface AccountService {

	Set<Account> getAll();

	List<Account> getTopNAccounts(int n);

}
