package service.impl;

import java.util.List;

import domain.Kind;
import repository.KindRepository;
import repository.impl.KindRepositoryImpl;
import service.KindService;

public class KindServiceImpl implements KindService{
	private KindRepository kindRepository = new KindRepositoryImpl();

	@Override
	public void add(Kind kind) {
		kindRepository.add(kind);
		
	}

	@Override
	public List<Kind> findAll() {
		// TODO Auto-generated method stub
		return kindRepository.findAll();
	}

	@Override
	public void delete(int kid) {
		kindRepository.delete(kid);
		
	}

}
