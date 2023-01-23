0package com.demo.service;

import com.demo.dao.DeptDao;
import com.demo.dao.DeptDaoImpl;

public class DeptServiceImpl implements DeptService {
	private DeptDao deptDao;

	public DeptServiceImpl() {
		super();
		this.deptDao = new DeptDaoImpl();
	}

	@Override
	public void closeMyConnction() {
		deptDao.closeMyConnction();
		
	}
	

}
