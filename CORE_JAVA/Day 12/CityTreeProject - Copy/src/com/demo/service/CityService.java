package com.demo.service;

import java.util.List;
import java.util.Map;

public interface CityService {

	boolean addNewCity();

	Map<String, List<String>> displayAll();

	List<String> findByCity(String cname);

	List<String> findByTree(String tname);

	boolean updateCity(String cname, String tname);

	Map<String, List<String>> getSortedMap();

	int findCountOfTree(String cname);

	boolean deleteTree(String cname, String tname);

	boolean deleteCity(String cname);
	
}
