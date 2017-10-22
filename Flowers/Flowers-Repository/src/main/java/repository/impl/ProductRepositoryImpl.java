package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Kind;
import domain.Picture;
import domain.Product;
import domain.Type;
import repository.BaseDao;
import repository.ProductRepository;

public class ProductRepositoryImpl extends BaseDao implements ProductRepository {

	@Override
	public List<Product> findAll() {
		List<Product> product = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM product");
		if (rs != null) {
			try {
				while (rs.next()) {
					product.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
							rs.getInt(6), rs.getInt(7), rs.getDouble(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
							rs.getDouble(12)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return product;
	}

	@Override
	public List<Product> findBypname() {
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

	@Override
	public void add(Product product, Type type, Kind kind, Picture picture) {
		// TODO Auto-generated method stub

	}

}
