package service.impl;

import java.util.List;

import domain.Picture;
import repository.PictureRepository;
import repository.impl.PictureRepositoryImpl;
import service.PictureService;

public class PictureServiceImpl implements PictureService{
	private PictureRepository pictureRepository = new PictureRepositoryImpl();

	@Override
	public void add(Picture picture) {
		pictureRepository.add(picture);
		
	}

	@Override
	public List<Picture> findAll() {
		// TODO Auto-generated method stub
		return pictureRepository.findAll();
	}

	@Override
	public void delete(int piid) {
		pictureRepository.delete(piid);
		
	}

}
