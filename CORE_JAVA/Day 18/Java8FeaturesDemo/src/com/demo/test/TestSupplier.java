package com.demo.test;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		Supplier<String> s=()->{
			String[] strarr= {"Python","Perl","JAVA"};
			int n=(int) (Math.random()*2+1);
			return strarr[n];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		Consumer<String> c=(s1)->{
			System.out.println(s1);
			
		};
		c.accept("Hello");
		c.accept("world");
		Predicate<Integer> p=x->x>5;
		System.out.println(p.test(6));
		System.out.println(p.test(3));

	}

}
