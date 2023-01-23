package com.demo.interfaces;

public interface Interface5 extends Interface3, Interface4 {
  void m51();
  default void defaultf1() {
		System.out.println("in default f1");
	}
}
