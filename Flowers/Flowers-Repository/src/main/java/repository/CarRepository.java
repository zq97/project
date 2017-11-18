package repository;

import java.util.List;
import domain.Car;
import domain.User;


public interface CarRepository {
	//添加购物车
	public void add(Car car);
	//查询购物车商品信息
	public List<Car> findAll();
	//修改商品数量
	public void update(Car car);
	//删除购物车商品
	public void delete(int carid);


}
