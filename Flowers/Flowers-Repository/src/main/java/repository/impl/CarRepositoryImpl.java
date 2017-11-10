package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Car;
import domain.Product;
import domain.User;
import repository.BaseDao;
import repository.CarRepository;

public class CarRepositoryImpl extends BaseDao implements CarRepository {

	@Override
	public void update(Car car) {
		super.execute("UPDATE car SET num=? where carid=? ", car.getNum(), car.getCarid());

	}

	@Override
	public void delete(int carid) {
		super.execute("DELETE FROM car where carid=?", carid);

	}

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Car> findAll(User user) {
		List<Car> car = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM car");
		if (rs != null) {
			try {
				while (rs.next()) {
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return car;
	}

}
