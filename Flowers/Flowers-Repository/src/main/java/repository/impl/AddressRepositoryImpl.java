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
					address.add(new Address(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
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
		super.execute("update address set aname=?,atel=?,aaddr=?,aemail=?"
				,address.getAname(),address.getAtel(),address.getAaddr(),address.getAemail());

	}

	@Override
	public void delete(int aid) {
		super.execute("delete from address where aid=?",aid);

	}

	@Override
	public void add(Address address) {
		super.execute("insert into address(aname,atel,aaddr,aemail) values(?,?,?,?)",address.getAname(),address.getAtel(),address.getAaddr(),address.getAemail());

	}

}
