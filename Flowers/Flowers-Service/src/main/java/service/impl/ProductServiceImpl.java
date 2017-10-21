package service.impl;

import java.util.List;

import domain.Product;
import repository.ProductRepository;
import repository.impl.ProductRepositoryImpl;
import service.ProductService;

public class ProductServiceImpl implements ProductService{
	private ProductRepository productRepository = new ProductRepositoryImpl();

	@Override
	public void add(Product product) {
		productRepository.add(product);
		
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public List<Product> findBypname() {
		// TODO Auto-generated method stub
		return findBypname();
	}

	@Override
	public void update(int pid) {
		productRepository.update(pid);
		
	}

	@Override
	public void delete(int pid) {
		productRepository.delete(pid);
		
	}

}
