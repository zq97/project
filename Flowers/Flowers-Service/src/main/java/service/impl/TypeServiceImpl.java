package service.impl;

import java.util.List;

import domain.Type;
import repository.TypeRepository;
import repository.impl.TypeRepositoryImpl;
import service.TypeService;

public class TypeServiceImpl implements TypeService{
	private TypeRepository typeRepository = new TypeRepositoryImpl();

	@Override
	public List<Type> findAll() {
		// TODO Auto-generated method stub
		return typeRepository.findAll();
	}

}
