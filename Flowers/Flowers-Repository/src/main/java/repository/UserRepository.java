package repository;

import java.util.List;

import domain.User;

public interface UserRepository {
	public void add(User user);
	public List<User> findAll();
	public void update(User user);

}
