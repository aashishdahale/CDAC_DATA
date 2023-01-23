package com.demo.interfaces;

@FunctionalInterface
public interface MyCompareInterface<T> {
	   //return a String whose length is greater
       T mycompare(T s1,T s2);
       default void mymethod() {
    	   System.out.println("in default method");
       }
       static void mystaticmethod() {
    	   System.out.println("in default method");
       }
     
}
