package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection con;
	static PreparedStatement psel,pins,pdel;
	static {
		try {
			con=DBUtil.getMyConnection();
			psel=con.prepareStatement("select * from product");
			pins=con.prepareStatement("insert into product values(?,?,?,?,?)");
			pdel=con.prepareStatement("delete from  product where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> findAllProduct() {
		List<Product> plist=new ArrayList<>();
		try {
			ResultSet rs=psel.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5)));
			}
			if(plist.size()>0)
				return plist;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void saveProduct(Product product) {
		try {
			pins.setInt(1, product.getPid());
			pins.setString(2, product.getPname());
			pins.setInt(3, product.getQty());
			pins.setDouble(4, product.getPrice());
			pins.setInt(5, product.getCid());
			pins.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void removeProduct(int pid) {
		try {
			pdel.setInt(1, pid);
			pdel.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
