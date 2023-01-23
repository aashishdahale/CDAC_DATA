package com.demo.test;

import com.demo.beans.Book;
import com.demo.beans.OuterClass;
import com.demo.beans.OuterClass.ChildClass;


public class TestNestedClass {

	public static void main(String[] args) {
		Book bk=new Book();
		Book.Lesson l1=bk.new Lesson(0, null);
		l1.m1();
		ChildClass ob= new ChildClass();
		ob.childmethod();

	}

}
