package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface FileService {

	void readFile(String string);

	void writeFile(String string);

	void addnewemplyee();

	List<Employee> getAllEmployee();

	boolean deleteployee(int id);

	boolean updateEmeployee(int id, String desg);

}
