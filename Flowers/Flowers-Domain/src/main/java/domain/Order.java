package domain;

import java.sql.Timestamp;


public class Order {
	private int oid;   //订单id
	private int onum;   //订单号
	private int uid;       //购买人(user类)id 外键
	private double ototal; //
	private int aid;  
	private int ostate;
	private Timestamp otime;  //订单时间
	private User user;    
	private Address address;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int onum, int uid, double ototal, int aid, int ostate, Timestamp otime, User user, Address address) {
		super();
		this.onum = onum;
		this.uid = uid;
		this.ototal = ototal;
		this.aid = aid;
		this.ostate = ostate;
		this.otime = otime;
		this.user = user;
		this.address = address;
	}
	public Order(int oid, int onum, int uid, double ototal, int aid, int ostate, Timestamp otime, User user,
			Address address) {
		super();
		this.oid = oid;
		this.onum = onum;
		this.uid = uid;
		this.ototal = ototal;
		this.aid = aid;
		this.ostate = ostate;
		this.otime = otime;
		this.user = user;
		this.address = address;
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
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public double getOtotal() {
		return ototal;
	}
	public void setOtotal(double ototal) {
		this.ototal = ototal;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
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
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", onum=" + onum + ", uid=" + uid + ", ototal=" + ototal + ", aid=" + aid
				+ ", ostate=" + ostate + ", otime=" + otime + "]";
	}

}
