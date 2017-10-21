package repository;

import java.util.List;

import domain.Collection;


public interface CollectionRepository {
	public void add(Collection collection);
	public List<Collection> findAll();
	public void delete(int colid);


}
