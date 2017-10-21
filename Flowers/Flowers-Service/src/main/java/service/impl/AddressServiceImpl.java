package service.impl;

import java.util.List;

import domain.Address;
import repository.AddressRepository;
import repository.impl.AddressRepositoryImpl;
import service.AddressService;

public class AddressServiceImpl implements AddressService{
	private AddressRepository addressRepository = new AddressRepositoryImpl();

	@Override
	public void add(Address address) {
		addressRepository.add(address);
		
	}

	@Override
	public List<Address> findAll() {
		return addressRepository.findAll();
	}

	@Override
	public void update(int aid) {
		addressRepository.update(aid);
		
	}

	@Override
	public void delete(int aid) {
		addressRepository.delete(aid);
		
	}

}
