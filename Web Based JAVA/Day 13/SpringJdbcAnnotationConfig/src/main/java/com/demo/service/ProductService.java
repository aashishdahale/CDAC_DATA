package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Product> displayAll();

	List<Product> displayByPrice(double price);

	Product displayById(int pid);

	int addnewProduct();

	int deleteById(int pid);

	int updateById(int pid, int qty, double price);

}
