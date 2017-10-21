package service.impl;

import java.util.List;

import domain.Collection;
import repository.CollectionRepository;
import repository.impl.CollectionRepositoryImpl;
import service.CollectionService;

public class CollectionServiceImpl implements CollectionService {
	private CollectionRepository collectionRepository = new CollectionRepositoryImpl();

	@Override
	public void add(Collection collection) {
		collectionRepository.add(collection);
		
	}

	@Override
	public List<Collection> findAll() {
		// TODO Auto-generated method stub
		return collectionRepository.findAll();
	}

	@Override
	public void delete(int colid) {
		collectionRepository.delete(colid);
		
	}

}
