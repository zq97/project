package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Address;
import domain.Order;
import domain.User;
import repository.BaseDao;
import repository.OrderRepository;

public class OrderRepositoryImpl extends BaseDao implements OrderRepository {

	@Override
	public List<Order> findAll() {
		List<Order> order = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM order");
		if (rs != null) {
			try {
				while (rs.next()) {
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return order;
	}

	@Override
	public void delete(int kid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Order order, User user, Address address) {
		// TODO Auto-generated method stub

	}

}
