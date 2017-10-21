package repository;

import java.util.List;

import domain.Address;

public interface AddressRepository {
	public void add(Address address);
	public List<Address> findAll();
	public void update(int aid);
	public void delete(int aid);

}
