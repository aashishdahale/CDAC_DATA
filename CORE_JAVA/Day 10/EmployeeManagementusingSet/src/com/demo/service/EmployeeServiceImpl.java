package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDAO;
import com.demo.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO edao;
	
	public EmployeeServiceImpl() {
		edao = new EmployeeDAOImpl();
	}
	
	@Override
	public void addEmployee() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter id:");
		int id = scan.nextInt();
		System.out.println("Enter name: ");
		String name = scan.next();
		System.out.println("Enter salary: ");
		double sal = scan.nextDouble();
		System.out.println("Enter doj (dd/MM/yyyy): ");
		String dt = scan.next();
		Date doj=null;
		try {
			doj = sdf.parse(dt);
			Employee e = new Employee(id, name, sal, doj);
			edao.save(e);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Set<Employee> displayAll() {
		return edao.findAll();
		
	}

	@Override
	public boolean removeById(int id) {
		return edao.deleteById(id);
		
	}

	@Override
	public boolean removeByName(String nm) {
		return edao.deleteByName(nm);
	}

	@Override
	public Set<Employee> sortBySalary() {
		return edao.sortBySal();
	}

	@Override
	public boolean modifySalary(int id, double sal) {
		return edao.updateSalary(id,sal);
	}

	@Override
	public Employee findById(int id) {
		
		
		return edao.searchById(id);
	}

	@Override
	public List<Employee> findByName(String nm) {
		return edao.searchByName(nm);
	}

	@Override
	public List<Employee> findBySalary(double salary) {
		return edao.searchBySalary(salary);
	}
	
}
