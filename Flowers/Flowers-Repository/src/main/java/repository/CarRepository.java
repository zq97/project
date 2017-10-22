package repository;

import java.util.List;

import domain.Car;
import domain.Product;


public interface CarRepository {
	public void add(Car car,Product product);
	public List<Car> findAll();
	public void update(Car car);
	public void delete(int carid);


}
