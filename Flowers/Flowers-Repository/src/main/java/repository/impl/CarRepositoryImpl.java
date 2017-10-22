package repository.impl;

import java.util.List;

import domain.Car;
import domain.Product;
import repository.BaseDao;
import repository.CarRepository;

public class CarRepositoryImpl extends BaseDao implements CarRepository{

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Car car) {
		
		
	}

	@Override
	public void delete(int carid) {
		super.execute("DELETE FROM car where carid=?",carid);
		
	}

	@Override
	public void add(Car car, Product product) {
		super.execute("INSERT INTO car(pid,num) VALIUES(?,?)",product.getPid(),car.getNum());
		
	}

}
