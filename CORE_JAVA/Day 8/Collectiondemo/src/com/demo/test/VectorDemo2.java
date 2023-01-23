package com.demo.test;

import java.util.Vector;

public class VectorDemo2 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<>(40,3);
		v.add(1);
		for(int i=0;i<40;i++) {
			v.add(i);
		}
		System.out.println("capacity :" +v.capacity());
		System.out.println("size :" +v.size());
		int pos=v.indexOf(1,1);
		System.out.println("position :"+pos);
	}

}
