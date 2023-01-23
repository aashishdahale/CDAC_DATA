package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Product;

public class MyNameComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		System.out.println("in name comparator");
		System.out.println(o1.getName()+"--------"+o2.getName());
		//return o1.getName().compareTo(o2.getName());
		if(o1.getName().equals(o2.getName())){
			return o1.getId()-o2.getId();
		}
		else {
			return o1.getName().compareTo(o2.getName());
		}
	}

}
