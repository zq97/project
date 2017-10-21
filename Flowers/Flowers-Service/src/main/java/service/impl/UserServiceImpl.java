package service.impl;

import java.util.List;

import domain.User;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import service.UserService;

public class UserServiceImpl implements UserService{
	private UserRepository userRepository = new UserRepositoryImpl();

	@Override
	public void add(User user) {
		userRepository.add(user);
		
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void update(int uid) {
		userRepository.update(uid);
		
	}

}
