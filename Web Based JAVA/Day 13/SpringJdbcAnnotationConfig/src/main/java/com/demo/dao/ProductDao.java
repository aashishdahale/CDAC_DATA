package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> findAll();

	List<Product> findByPrice(double price);

	Product findById(int pid);

	int save(Product p);

	int removeById(int pid);

	int modifyById(int pid, int qty, double price);

}
