package com.demo.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TestLocalDate {
	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		int dd=ld.getDayOfMonth();
		int mm=ld.getMonthValue();
		int yy=ld.getYear();
		System.out.format("%d-%d-%d",dd,mm,yy);
		LocalTime lt=LocalTime.now();
		int hr=lt.getHour();
		int min=lt.getMinute();
		int sec=lt.getSecond();
		System.out.println("hours : "+hr+"Minutes: "+min+"Seconds: "+sec);
		LocalDate id1=LocalDate.of(2022, 12, 31);
		
		List<Integer> lst=new ArrayList<>();
		lst.add(20);
		lst.add(10);
		lst.add(5);
		lst.add(30);
		
		boolean status=lst.stream().filter(x->x%2==0).anyMatch(x->x>=20);
		System.out.println(status);
		
		List<Employee> empob=new ArrayList<>();
		///code to filter employee objects based on desg
		//disdplay all managers;
		empob.stream().filter(x->x.getDesg().equals("manager")).forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
