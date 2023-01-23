package com.demo.dao;

import java.util.List;
import java.util.Map;

public interface CityDAO {

	boolean addNewEntry(String city, List<String> lst);

	Map<String, List<String>> getAll();

	List<String> getByCity(String cname);

	List<String> getByTree(String tname);

	boolean modifyCity(String cname, String tname);

	Map<String, List<String>> getSortedData();

	int getCountTree(String cname);

	boolean removeTree(String cname, String tname);

	boolean removeCity(String cname);
	
	
	
}
