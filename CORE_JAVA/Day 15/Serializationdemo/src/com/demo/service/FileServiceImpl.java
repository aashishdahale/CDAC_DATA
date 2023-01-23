package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.FileDao;
import com.demo.dao.FileDaoImpl;

public class FileServiceImpl implements FileService{
	private FileDao fdao;

	public FileServiceImpl() {
		super();
		this.fdao = new FileDaoImpl();
	}

	@Override
	public void readFile(String fname) {
		fdao.readFiledata(fname);
		
	}

	@Override
	public void writeFile(String fname) {
		fdao.wrteFiledata(fname);
		
	}

	@Override
	public void addnewemplyee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int id=sc.nextInt();
		System.out.println("enetr name");
        String nm=sc.next();
        System.out.println("enetr desg");
        String desg=sc.next();
        Employee ob=new Employee(id,nm,desg);
        fdao.insertdata(ob);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return fdao.findAllEmployee();
	}

	@Override
	public boolean deleteployee(int id) {
		return fdao.deleteById(id);
	}

	@Override
	public boolean updateEmeployee(int id, String desg) {
		return fdao.modifyEmeployee(id,desg);
	}
	

}
