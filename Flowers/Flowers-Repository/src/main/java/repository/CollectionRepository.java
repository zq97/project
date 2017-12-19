package repository;

import java.util.List;

import domain.Collection;
import domain.Product;
import domain.User;


public interface CollectionRepository {
	public void add(User user,Product product);
	public List<Collection> findAll(String uname);
	public void delete(int colid);


}
