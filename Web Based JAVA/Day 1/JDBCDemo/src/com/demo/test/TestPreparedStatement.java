package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestPreparedStatement {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/test?useSSL=false";
			String username="root";
			String password="root123";
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement ps=con.prepareStatement("select * from dept");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Deptno: "+rs.getInt(1));
				System.out.println("Dname : "+rs.getString(2));
				System.out.println("Location : "+rs.getString(3));
				System.out.println("------------------------");
				
			}
			int id=100;
			String nm="test";
			String loc="xxxxx";
			PreparedStatement ps1=con.prepareStatement("insert into dept values(?,?,?)");
			ps1.setInt(1, id);
			ps1.setString(2, nm);
			ps1.setString(3, loc);
			int n=ps1.executeUpdate();
			if(n>0) {
				System.out.println("inserted successfully");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
