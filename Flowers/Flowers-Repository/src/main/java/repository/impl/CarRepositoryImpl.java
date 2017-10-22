package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Car;
import domain.Product;
import repository.BaseDao;
import repository.CarRepository;

public class CarRepositoryImpl extends BaseDao implements CarRepository {

	@Override
	public List<Car> findAll() {
		List<Car> car = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM car");
		if (rs != null) {
			try {
				while (rs.next()) {
					car.add(new Car(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return car;
	}

	@Override
	public void update(Car car) {
		super.execute("UPDATE car SET num=? where carid=? ", car.getNum(), car.getCarid());

	}

	@Override
	public void delete(int carid) {
		super.execute("DELETE FROM car where carid=?", carid);

	}

	@Override
	public void add(Car car, Product product) {
		super.execute("INSERT INTO car(pid,num) VALIUES(?,?)", product.getPid(), car.getNum());

	}

}
