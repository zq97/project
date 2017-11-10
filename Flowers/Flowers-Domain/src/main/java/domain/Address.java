package domain;

import java.io.Serializable;

public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int aid;
	private User user; // 用户, 外键
	private String aname; // 收货人姓名
	private String atel; // 收货人电话
	private String aaddr; // 收货地址
	private String aemail; // 送货邮箱

	public Address() {
		super();
	}

	public Address(User user, String aname, String atel, String aaddr, String aemail) {
		super();
		this.user = user;
		this.aname = aname;
		this.atel = atel;
		this.aaddr = aaddr;
		this.aemail = aemail;
	}

	public Address(int aid, User user, String aname, String atel, String aaddr, String aemail) {
		super();
		this.aid = aid;
		this.user = user;
		this.aname = aname;
		this.atel = atel;
		this.aaddr = aaddr;
		this.aemail = aemail;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAtel() {
		return atel;
	}

	public void setAtel(String atel) {
		this.atel = atel;
	}

	public String getAaddr() {
		return aaddr;
	}

	public void setAaddr(String aaddr) {
		this.aaddr = aaddr;
	}

	public String getAemail() {
		return aemail;
	}

	public void setAemail(String aemail) {
		this.aemail = aemail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", user=" + user + ", aname=" + aname + ", atel=" + atel + ", aaddr=" + aaddr
				+ ", aemail=" + aemail + "]";
	}
	
}
