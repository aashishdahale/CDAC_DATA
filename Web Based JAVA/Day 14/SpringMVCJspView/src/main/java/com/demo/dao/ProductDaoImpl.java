package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public List<Product> findAll() {
		RowMapper rm=(rs,numrows)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(4));
			p.setPrice(rs.getDouble(3));
			return p;
			
		};
		List<Product> plist=jdbcTemplate.query("select * from product69", rm);
		return plist;
	}


	@Override
	public List<Product> findByPrice(double price) {
		List<Product> plist=jdbcTemplate.query("select * from product69 where price>?", new Object[] {price},
				BeanPropertyRowMapper.newInstance(Product.class));
		return plist;
	}


	@Override
	public Product findById(int pid) {
		Product p=(Product) jdbcTemplate.queryForObject("select * from product69 where pid=?",
				new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
		return p;
	}


	@Override
	public int save(Product p) {
		return jdbcTemplate.update("insert into product69 values(?,?,?,?)",
				new Object[] {p.getPid(),p.getPname(),p.getPrice(),p.getQty()});
		
	}


	@Override
	public int removeById(int pid) {
		return jdbcTemplate.update("delete from product69 where pid=?",
				new Object[] {pid});
	}


	@Override
	public int modifyById(int pid, int qty, double price) {
		return jdbcTemplate.update("update product69 set qty=?,price=? where pid=?",
				new Object[] {qty,price,pid});
	
	}

}
