package com.demo.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		Map<String,Integer> hm=new TreeMap<>();
		hm.put("DAI",100);
		hm.put("DBDA",345);
		hm.put("DAC",400);
		hm.put("DHPCSA",150);
		hm.put("DAI",120);
		System.out.println(hm);
		//if key is known and want to find value
		String k="DBDA";
		if(hm.containsKey(k)) {
		   System.out.println("no of DBDA participants"+hm.get(k));
		
		}
		//if value is known how to find the key
		for(String s:hm.keySet()) {
			System.out.println(s+"====="+hm.get(s));
			if(hm.get(s)>300)
			System.out.println(s);
		}
		System.out.println("----------------------------------");
		for(Map.Entry<String,Integer> s1:hm.entrySet()) {
			if(s1.getValue()>300)
			System.out.println(s1.getKey());
		}
		System.out.println("----------------------------------");
		Set<String> s2=hm.keySet();
		System.out.println(s2);
		Iterator<String> it=s2.iterator();
		while(it.hasNext()) {
			String k1=it.next();
			System.out.println(k1+"---->"+hm.get(k1));
		}
		
	}

}
