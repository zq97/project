package repository;

import java.util.List;

import domain.Kind;
import domain.Picture;
import domain.Product;
import domain.Type;

public interface ProductRepository {
	//查询热门商品
	public List<Product> hot();
	//查询所有
	public List<Product> findAll();
	//模糊查询
	public List<Product> findBypname(String pname);
	
	public void update(Product product);
	public void delete(int pid);
	

}
