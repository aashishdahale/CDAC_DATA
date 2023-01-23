package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Baner")
  private String street;
	@Value("Pune")
  private String city;
public Address() {
	super();
	System.out.println("in default constructor");
}
public Address(String street, String city) {
	super();
	System.out.println("in parametrized constructor");
	this.street = street;
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	System.out.println("in set street");
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	System.out.println("in set city");
	this.city = city;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + "]";
}
  
}
