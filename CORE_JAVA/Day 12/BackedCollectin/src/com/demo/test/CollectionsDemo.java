package com.demo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.demo.interfaces.MyCompareInterface;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,2,3,4,5,6);
		List<Integer> lst1=Arrays.asList(10,20,30,40,5,6);
		System.out.println(lst);
		Collections.shuffle(lst);
		System.out.println(lst);
		System.out.println(Collections.max(lst));
		System.out.println(Collections.min(lst));
		System.out.println(Collections.disjoint(lst, lst1));
		MyCompareInterface<String> s=(s1,s2)->{return s1.length()>s2.length()?s1:s2;};
		System.out.println(s.mycompare("Hello", "world!!"));
		MyCompareInterface<Integer> intcompare=(s1,s2)->{return s1>s2?s1:s2;};
		System.out.println(s.mycompare("Hello", "world!!"));
		System.out.println(intcompare.mycompare(5,6));
	}

}
