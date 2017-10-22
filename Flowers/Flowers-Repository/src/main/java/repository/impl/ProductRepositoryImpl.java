package repository.impl;

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
		// TODO Auto-generated method stub
		return null;
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
