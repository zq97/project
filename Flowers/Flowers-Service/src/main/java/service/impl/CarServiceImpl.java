package service.impl;

import java.util.List;

import domain.Car;
import repository.CarRepository;
import repository.impl.CarRepositoryImpl;
import service.CarService;

public class CarServiceImpl implements CarService{
	private CarRepository carRepository = new CarRepositoryImpl();

	@Override
	public void add(Car car) {
		carRepository.add(car);
		
	}

	@Override
	public List<Car> findAll() {
		return carRepository.findAll();
	}

	@Override
	public void update(int carid) {
		carRepository.update(carid);
		
	}

	@Override
	public void delete(int carid) {
		carRepository.delete(carid);
		
	}

}
