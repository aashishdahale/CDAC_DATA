package com.demo.enums;

public enum Coffee {
  large(300,250),medium(200,150),small(100,90);
	
 private int size;
 private float price;
 private Coffee(int size, float price) {
		this.size = size;
		this.price = price;
	}
 
 
}
