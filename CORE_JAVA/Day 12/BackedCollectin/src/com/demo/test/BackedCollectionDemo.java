package com.demo.test;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BackedCollectionDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(20);
		ts.add(5);
		ts.add(95);
		System.out.println(ts);
		Set<Integer> headset=ts.headSet(50,true);
		
		Set<Integer> tailset=ts.tailSet(50);
		System.out.println(headset);
		System.out.println(tailset);
		ts.add(10);
		ts.add(70);
		ts.add(25);
		System.out.println(ts);
		System.out.println(headset);
		System.out.println(tailset);
		}


}
