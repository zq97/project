package repository;

import java.util.List;

import domain.Collection;
import domain.Product;
import domain.User;


public interface CollectionRepository {
	public void add(Collection collection,User user,Product product);
	public List<Collection> findAll();
	public void delete(int colid);


}
