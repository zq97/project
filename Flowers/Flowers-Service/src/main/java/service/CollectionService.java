package service;

import java.util.List;

import domain.Collection;


public interface CollectionService {
	public void add(Collection collection);
	public List<Collection> findAll();
	public void delete(int colid);


}
