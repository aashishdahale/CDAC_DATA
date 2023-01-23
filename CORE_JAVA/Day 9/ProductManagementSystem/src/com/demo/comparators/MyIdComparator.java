package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Product;

public class MyIdComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getId()-o2.getId();
	}

}
