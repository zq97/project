package service;

import java.util.List;

import domain.Picture;


public interface PictureService {
	public void add(Picture picture);
	public List<Picture> findAll();
	public void delete(int piid);


}
