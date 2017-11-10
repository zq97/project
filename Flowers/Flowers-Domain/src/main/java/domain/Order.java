package domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int oid; // 订单id
	private int onum; // 订单号
	private User user; // 购买人, 外键
	private double ototal; //商品总价
	private Address address;      //地址，外键
	private int ostate;     //付款状态
	private Timestamp otime; // 订单时间

	public Order() {
		super();
	}

	public Order(int onum, User user, double ototal, Address address, int ostate, Timestamp otime) {
		super();
		this.onum = onum;
		this.user = user;
		this.ototal = ototal;
		this.address = address;
		this.ostate = ostate;
		this.otime = otime;
	}

	public Order(int oid, int onum, User user, double ototal, Address address, int ostate, Timestamp otime) {
		super();
		this.oid = oid;
		this.onum = onum;
		this.user = user;
		this.ototal = ototal;
		this.address = address;
		this.ostate = ostate;
		this.otime = otime;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getOnum() {
		return onum;
	}

	public void setOnum(int onum) {
		this.onum = onum;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getOtotal() {
		return ototal;
	}

	public void setOtotal(double ototal) {
		this.ototal = ototal;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getOstate() {
		return ostate;
	}

	public void setOstate(int ostate) {
		this.ostate = ostate;
	}

	public Timestamp getOtime() {
		return otime;
	}

	public void setOtime(Timestamp otime) {
		this.otime = otime;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", onum=" + onum + ", user=" + user + ", ototal=" + ototal + ", address=" + address
				+ ", ostate=" + ostate + ", otime=" + otime + "]";
	}
	

}
