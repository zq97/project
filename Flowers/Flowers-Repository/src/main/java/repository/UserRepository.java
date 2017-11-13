package repository;

import java.util.List;

import domain.User;

public interface UserRepository {
	//添加用户，注册
	public void add(User user);
	//查询个人信息
	public List<User> findUser();
	//修改个人信息
	public void update(User user);
	public User findById(int uid);
	
	User login(User u);

}
