package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Car;
import domain.Picture;
import domain.Product;
import repository.BaseDao;
import repository.CarRepository;



public class CarRepositoryImpl extends BaseDao implements CarRepository{

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
		super.execute("insert into car(num,product_pid) values(?,?)", car.getNum(),
				car.getProduct().getPid());

	}

	@Override
	public List<Car> findAll() {
		List<Car> car = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("select c.carid ,c.num,p.pname,p.pcost,pi.piname\r\n" + 
				"from car c,product p,picture pi\r\n" + 
				"where c.product_pid=p.pid and p.picture_piid=pi.piid");
		if (rs != null) { 
			try {// select * from product p, car c where p.id = c.id and
				while (rs.next()) {
					Picture picture=new Picture(rs.getString(5));
					Product product = new Product(rs.getString(3),rs.getDouble(4),picture);
					car.add(new Car(rs.getInt(1),rs.getInt(2), product));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return car;
	}

	@Override
	public void addUser(Car car) {
		super.execute("insert into car(num,product_pid,user_uid) values(?,?,?)", car.getNum(),
				car.getProduct().getPid(), car.getUser().getUid());
		
	}

}
