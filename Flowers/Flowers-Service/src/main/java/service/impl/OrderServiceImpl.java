package service.impl;

import java.util.List;

import domain.Order;
import repository.OrderRepository;
import repository.impl.OrderRepositoryImpl;
import service.OrderService;

public class OrderServiceImpl implements OrderService{
	private OrderRepository orderRepository = new OrderRepositoryImpl();

	@Override
	public void add(Order order) {
		orderRepository.add(order);
		
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public void delete(int kid) {
		orderRepository.delete(kid);
		
	}

}
