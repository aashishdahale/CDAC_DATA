package com.demo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CityDAOImpl implements CityDAO{
	static Map<String, List<String>> cmap;

	static {
		cmap = new HashMap<String, List<String>>();
		List<String> trees1 = Arrays.asList("Mango", "Neem", "Lemon");
		cmap.put("Pune", trees1);
		List<String> trees2 = Arrays.asList("Marigold", "Banyan", "Coconut");		
		cmap.put("Mumbai", trees2);



	}

	@Override
	public boolean addNewEntry(String city, List<String> lst) {
		if(!cmap.containsKey(city)) {
			cmap.put(city, lst);
			return true;
		}
		return false;
	}

	@Override
	public Map<String, List<String>> getAll() {
		if(cmap.isEmpty())
			return null;
		return cmap;
	}

	@Override
	public List<String> getByCity(String cname) {
		return cmap.get(cname);
	}

	@Override
	public List<String> getByTree(String tname) {
		//create a list to store the city names
		List<String> cities = new ArrayList<String>();
		//navigate through the map
		for(Map.Entry<String, List<String>> e: cmap.entrySet()) {
			//check whether the tree exists or not in the city
			if(e.getValue().contains(tname)) {
				cities.add(e.getKey());
			}
		}
		if(cities.size()>0) return cities;
		return null;
	}

	@Override
	public boolean modifyCity(String cname, String tname) {
		//find the treelist for the give city
		List<String> tlist=cmap.get(cname);
		//check weather treelist found
		if(tlist!=null) {
			//check weather treename is already there 
			if(!tlist.contains(tname)) {
				tlist.add(tname);
				return true;
			}
		}
		return false;
	}

	@Override
	public Map<String, List<String>> getSortedData() {
		Map <String,List<String>> tm=new TreeMap<>();
		//for(String s:cmap.keySet()) {
		//tm.put(s, cmap.get(s));
		tm.putAll(cmap);
		//}
		if(!tm.isEmpty()) {
			return tm;
		}
		return null;
	}

	@Override
	public int getCountTree(String cname) {
		List<String> lst=cmap.get(cname);
		if(lst!=null) {
			return lst.size();
		}
		return 0;
	}

	@Override
	public boolean removeTree(String cname, String tname) {
		List<String> list=cmap.get(cname);
		if(list!=null) {
			return list.remove(tname);
		}
		return false;
	}

	@Override
	public boolean removeCity(String cname) {
		List<String> list=cmap.remove(cname);
		if(list==null)
			return false;
		return true;
	}
}