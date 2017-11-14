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
	private double ototal; //商品总价
	private int ostate;     //付款状态
	private Timestamp otime; // 订单时间
	private User user; // 购买人, 外键
	private Address address;      //地址，外键
	private Product product;   //商品表，外键
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int onum, double ototal, int ostate, Timestamp otime, User user, Address address, Product product) {
		super();
		this.onum = onum;
		this.ototal = ototal;
		this.ostate = ostate;
		this.otime = otime;
		this.user = user;
		this.address = address;
		this.product = product;
	}
	public Order(int oid, int onum, double ototal, int ostate, Timestamp otime, User user, Address address,
			Product product) {
		super();
		this.oid = oid;
		this.onum = onum;
		this.ototal = ototal;
		this.ostate = ostate;
		this.otime = otime;
		this.user = user;
		this.address = address;
		this.product = product;
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
	public double getOtotal() {
		return ototal;
	}
	public void setOtotal(double ototal) {
		this.ototal = ototal;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", onum=" + onum + ", ototal=" + ototal + ", ostate=" + ostate + ", otime=" + otime
				+ ", user=" + user + ", address=" + address + ", product=" + product + "]";
	}

	
	

}
