package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	
	void addEmployee();

	Set<Employee> displayAll();

	boolean removeById(int id);

	boolean removeByName(String nm);

	Set<Employee> sortBySalary();

	boolean modifySalary(int id, double sal);

	Employee findById(int id);

	List<Employee> findByName(String nm);


	List<Employee> findBySalary(double salary);
	
}
