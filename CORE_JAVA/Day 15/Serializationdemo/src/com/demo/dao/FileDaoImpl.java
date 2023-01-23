package com.demo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class FileDaoImpl implements FileDao {
	static List<Employee> elist;
	static {
		elist=new ArrayList<>();
	}

	@Override
	public void readFiledata(String fname) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname));){
			while(true) {
				Employee ob=(Employee)ois.readObject();
				elist.add(ob);
			}
			
		}catch(EOFException e) {
			System.out.println("Reached to end of file");
		}catch(IOException|ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void wrteFiledata(String fname) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname))){
			
			for(Employee ob:elist) {
				oos.writeObject(ob);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void insertdata(Employee ob) {
		elist.add(ob);
		
	}

	@Override
	public List<Employee> findAllEmployee() {
		return elist;
	}

	@Override
	public boolean deleteById(int id) {
		return elist.remove(new Employee(id));
	}

	@Override
	public boolean modifyEmeployee(int id, String desg) {
		int pos=elist.indexOf(new Employee(id));
		if(pos!=-1) {
			elist.get(pos).setDesg(desg);
			return true;
		}
		return false;
	}

}
