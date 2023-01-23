package com.demo.dao;

import java.sql.Connection;

public class DeptDaoImpl implements DeptDao {
	static Connection con;
	static {
		 con=DBUtil.getMyConnection();
	}
	@Override
	public void closeMyConnction() {
		DBUtil.closeMyConnection();
		
	}

}
