package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Product;
import repository.BaseDao;
import repository.ProductRepository;

public class ProductRepositoryImpl extends BaseDao implements ProductRepository {

	@Override
	public List<Product> hot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		List<Product> product = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM product");
		if (rs != null) {
			try {
				while (rs.next()) {
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return product;
	}

	@Override
	public List<Product> findBypname(String pname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int pid) {
		// TODO Auto-generated method stub
		
	}


}
