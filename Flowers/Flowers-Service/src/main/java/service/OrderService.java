package service;

import java.util.List;

import domain.Order;



public interface OrderService {
	public void add(Order order);
	public List<Order> findAll();
	public void delete(int kid);

}
