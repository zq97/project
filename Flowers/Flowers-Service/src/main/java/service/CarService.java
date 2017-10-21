package service;

import java.util.List;

import domain.Car;


public interface CarService {
	public void add(Car car);
	public List<Car> findAll();
	public void update(int carid);
	public void delete(int carid);


}
