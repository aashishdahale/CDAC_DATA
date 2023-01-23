"select * frompackage com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
		List<Product> plist=jdbcTemplate.query("select * from product", rm);
		return plist;
	}


	@Override
	public List<Product> findByPrice(double price) {
		List<Product> plist=jdbcTemplate.query("select * from product where price>?", new Object[] {price},
				BeanPropertyRowMapper.newInstance(Product.class));
		return plist;
	}


	@Override
	public Product findById(int pid) {
		try {
		Product p=(Product) jdbcTemplate.queryForObject("select * from product where pid=?",
				new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
		return p;
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}


	@Override
	public Product save(Product p) {
		int n= jdbcTemplate.update("insert into product values(?,?,?,?)",
				new Object[] {p.getPid(),p.getPname(),p.getPrice(),p.getQty()});
		if(n>0) {
			return p;
		}
		else {
			return null;
		}
		
	}


	@Override
	public int removeById(int pid) {
		return jdbcTemplate.update("delete from product where pid=?",
				new Object[] {pid});
	}


	@Override
	public int modifyById(Product p) {
		return jdbcTemplate.update("update product set pname=?,qty=?,price=? where pid=?",
				new Object[] {p.getPname(),p.getQty(),p.getPrice(),p.getPid()});
	
	}

}
