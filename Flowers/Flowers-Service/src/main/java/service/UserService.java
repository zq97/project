package service;

import java.util.List;

import domain.User;

public interface UserService {
	public void add(User user);
	public List<User> findAll();
	public void update(int uid);

}
