package com.demo.beans;

public class OuterClass {
  public void m1(){
	  System.out.println("In m1");
  }
  public static void m2(){
	  System.out.println("In m2 static method");
  }
  public static class ChildClass{
	  public void childmethod() {
		  m2();
	  }
  }
}
