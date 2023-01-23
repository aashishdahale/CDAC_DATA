package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.beans.Employee;

public class TestSerialization {

	public static void main(String[] args) {
		Employee[] emparr= {new Employee(10,"Rajas","mgr"),
				new Employee(11,"Revati","ux designer")};
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empdata.dat"))){
			for(Employee ob:emparr) {
				oos.writeObject(ob);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empdata.dat"));){
			while(true) {
				Employee ob1=(Employee)ois.readObject();
				System.out.println(ob1);
			}
		}catch(EOFException e) {
			System.out.println("Reached to end of file");
		}catch(IOException|ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
