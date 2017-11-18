package repository;

import java.util.List;

import domain.Address;
import domain.Order;
import domain.User;



public interface OrderRepository {
	public void add(Order order);
	public List<Order> findAll();
	public void delete(int oid);
	 List<Order> findById(int oid);

}
