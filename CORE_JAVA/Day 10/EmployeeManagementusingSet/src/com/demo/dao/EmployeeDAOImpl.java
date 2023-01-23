package com.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	static Set<Employee> hset;

	static {
		hset = new HashSet<>();
		hset.add(new Employee(1, "Hello", 9999999, new Date()));
		hset.add(new Employee(2, "World", 9988969, new Date()));
		hset.add(new Employee(7, "CR7", 7777777, new Date()));
	}
	
	@Override
	public void save(Employee e) {
		hset.add(e);
	}

	@Override
	public Set<Employee> findAll() {
		if(hset.isEmpty())
			return null;
		return hset;
	}

	@Override
	public boolean deleteById(int id) {
		return hset.remove(new Employee(id));
	}

	@Override
	public boolean deleteByName(String nm) {
		
		Iterator<Employee>it =hset.iterator();
		while(it.hasNext()) {
			if(it.next().getName().equals(nm)) {
				it.remove();
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Set<Employee> sortBySal() {
		Set<Employee> ts = new TreeSet();
		if(!hset.isEmpty()) {
			for(Employee e:hset) {
				ts.add(e);
			}
			return ts;
		}
		return null;
		
	}

	@Override
	public boolean updateSalary(int id, double sal) {
				Employee e = searchById(id);
				if(e!=null) {
					e.setSalary(sal);
					return true;
				}
		
			return false;
	}

	@Override
	public Employee searchById(int id) {
		for(Employee e : hset) {
			if(e.getId()==id) {
				return e;
			}
		}
		
		return null;
	}

	@Override
	public List<Employee> searchByName(String nm) {
		List<Employee> elist = new ArrayList<>();
		for(Employee e : hset) {
			if(e.getName().equals(nm)) {
				elist.add(e);
			}
		}
		if(elist.size()>0)
			return elist;
		
		return null;
	}

	@Override
	public List<Employee> searchBySalary(double salary) {
		List<Employee> elist=hset.stream().filter(x->x.getSalary()>salary).collect(Collectors.toList());
		if(elist.size()>0)
			return elist;
		
		return null;
	}
	
}
