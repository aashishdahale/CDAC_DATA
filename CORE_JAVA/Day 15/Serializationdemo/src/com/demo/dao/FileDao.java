package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface FileDao {

	void readFiledata(String fname);

	void wrteFiledata(String fname);

	void insertdata(Employee ob);

	List<Employee> findAllEmployee();

	boolean deleteById(int id);

	boolean modifyEmeployee(int id, String desg);

}
