package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Account;

public interface AccountDao {

	Set<Account> findAll();

	List<Account> findTopN(int n);

}
