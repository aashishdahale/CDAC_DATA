package com.demo.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> intlist=new ArrayList<>();
		intlist.add(23);
		intlist.add(10);
		intlist.add(23);
		intlist.add(20);
		intlist.add(5);
		System.out.println(intlist);
		//to navigate through ArrayList
		/*
		 * for(int i=0;i<intlist.size();i++) { System.out.println(intlist.get(i)); }
		 */
		/*
		 * for(Integer ob:intlist) { System.out.println(ob); }
		 */
		/*
		 * Iterator<Integer> it=intlist.iterator(); while(it.hasNext()) { Integer
		 * ob=it.next(); if(ob>20) it.remove(); //remove the value return by it.next() }
		 */
		List<Integer> newlist=intlist.stream().filter(x->x<=20).collect(Collectors.toList());
		
		// to find all numbers from intlist which are divisible by 5  
		List<Integer> nlist=intlist.stream().filter(x->x%5==0).collect(Collectors.toList());
		intlist.remove(new Integer(5));
		System.out.println(intlist);
		
		
	}

}
