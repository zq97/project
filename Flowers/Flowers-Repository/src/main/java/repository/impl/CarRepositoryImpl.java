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
		super.execute("insert into car(num,product_pid,user_uid) values(?,?,?)",car.getNum(),car.getProduct().getPid(),car.getUser().getUid());
		
	}

	@Override
	public List<Car> findAll(User user) {
		List<Car> car = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("select c.num,p.pname,u.uname\r\n" + 
				"from car c\r\n" + 
				"inner join product p on p.pid=c.product_pid\r\n" + 
				"inner join user u on u.uid=c.user_uid");
		if (rs != null) {
			try {
				while (rs.next()) {
					Product product=new Product(rs.getString(2));
					User u=new User(rs.getString(3));
					car.add(new Car(rs.getInt(1),product,user));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return car;
	}

}
