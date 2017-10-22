package repository;

import java.util.List;

import domain.Kind;
import domain.Picture;
import domain.Product;
import domain.Type;

public interface ProductRepository {
	public void add(Product product,Type type,Kind kind,Picture picture);
	public List<Product> findAll();
	public List<Product> findBypname();
	public void update(Product product);
	public void delete(int pid);
	

}
