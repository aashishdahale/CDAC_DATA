package com.demo.service;

import com.demo.dao.CityDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.dao.CityDAO;

public class CityServiceImpl implements CityService{
	private CityDAO cdao;

	public CityServiceImpl() {
		super();
		cdao = new CityDAOImpl();
	}

	@Override
	public boolean addNewCity() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter city name: ");
		String city = scan.next();
		List<String> lst = new ArrayList<>();
		char ans;
		do {
			System.out.print("Please enter tree name: ");
			String tname = scan.next();
			lst.add(tname);
			System.out.print("Do you want to continue? (y/n) :");
			ans = scan.next().charAt(0);
		}while(ans=='y');
		return cdao.addNewEntry(city, lst);
	}

	@Override
	public Map<String, List<String>> displayAll() {
		return cdao.getAll();
	}

	@Override
	public List<String> findByCity(String cname) {
		return cdao.getByCity(cname);
	}

	@Override
	public List<String> findByTree(String tname) {
		return cdao.getByTree(tname);
	}

	@Override
	public boolean updateCity(String cname, String tname) {

		return cdao.modifyCity(cname,tname);
	}

	@Override
	public Map<String, List<String>> getSortedMap() {
		return cdao.getSortedData();
	}

	@Override
	public int findCountOfTree(String cname) {
		// TODO Auto-generated method stub
		return cdao.getCountTree(cname);
	}

	@Override
	public boolean deleteTree(String cname, String tname) {
		return cdao.removeTree(cname,tname);
	}

	@Override
	public boolean deleteCity(String cname) {
		// TODO Auto-generated method stub
		return cdao.removeCity(cname);
	}
	
	
}
