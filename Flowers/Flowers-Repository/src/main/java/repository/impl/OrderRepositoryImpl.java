package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Address;
import domain.Order;
import domain.Product;
import domain.User;
import repository.BaseDao;
import repository.OrderRepository;

public class OrderRepositoryImpl extends BaseDao implements OrderRepository {

	@Override
	public List<Order> findAll() {
		List<Order> order = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("select o.oid,o.onum,o.ototal,o.ostate,o.otime,p.pname"
				+ ",a.aname,a.atel,a.aaddr,a.aemail from orders o,product p,address a\r\n" + 
				"where o.address_aid=a.aid and o.product_pid=p.pid");
		if (rs != null) {
			try {
				while (rs.next()) {
					Address address=new Address(rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
					Product product=new Product(rs.getString(6));
					order.add(new Order(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getInt(4),rs.getTimestamp(5),address,product));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return order;
	}

	@Override
	public void delete(int oid) {
		super.execute("delete from orders where oid=?",oid);

	}

	
	@Override
	public void add(Order order) {
		super.execute("insert into orders(onum,ototal,ostate,otime,user_uid,address_aid,product_pid) "
				+ "values(?,?,?,?,?,?,?)",order.getOnum(),order.getOtotal(),order.getOstate()
				,order.getOtime(),order.getUser().getUid(),order.getAddress().getAid(),order.getProduct().getPid());
		
	}


	@Override
	public List<Order> findById(int oid) {
		List<Order> order = new ArrayList<>();
		ResultSet rs = (ResultSet) super.execute("select o.oid,o.onum,o.ototal,o.ostate,o.otime,p.pname"
				+ ",a.aname,a.atel,a.aaddr,a.aemail from orders o,product p,address a "
				+ "where o.address_aid=a.aid and o.product_pid=p.pid and o.oid=?",oid);
		if (rs != null) {
			try {
				while (rs.next()) {
					Address address=new Address(rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
					Product product=new Product(rs.getString(6));
					order.add(new Order(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getInt(4),rs.getTimestamp(5),address,product));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return order;
	}

}
