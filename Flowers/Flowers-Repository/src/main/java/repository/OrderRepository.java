package repository;

import java.util.List;

import domain.Order;



public interface OrderRepository {
	public void add(Order order);
	public List<Order> findAll();
	public void delete(int kid);

}
