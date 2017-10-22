package repository;

import java.util.List;

import domain.Address;
import domain.User;

public interface AddressRepository {
	public void add(Address address,User user);
	public List<Address> findAll();
	public void update(Address address);
	public void delete(int aid);

}
