package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDAO {

	void save(Employee e);

	Set<Employee> findAll();

	boolean deleteById(int id);

	boolean deleteByName(String nm);

	Set<Employee> sortBySal();

	boolean updateSalary(int id, double sal);

	Employee searchById(int id);

	List<Employee> searchByName(String nm);

	List<Employee> searchBySalary(double salary);
	
}
