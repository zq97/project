package repository;

import java.util.List;

import domain.Product;

public interface ProductRepository {
	public void add(Product product);
	public List<Product> findAll();
	public List<Product> findBypname();
	public void update(int pid);
	public void delete(int pid);
	

}
