package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Address;
import domain.User;
import repository.AddressRepository;
import repository.BaseDao;

public class AddressRepositoryImpl extends BaseDao implements AddressRepository {

	@Override
	public List<Address> findAll() {
		List<Address> address = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("SELECT * FROM address");
		if (rs != null) {
			try {
				while (rs.next()) {
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return address;
	}

	@Override
	public void update(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int aid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Address address, User user) {
		// TODO Auto-generated method stub

	}

}
