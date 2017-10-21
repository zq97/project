package domain;


public class Address {
	private int aid;
	private int uid; //用户id 外键
	private String aname; //收货人姓名
	private String atel;   //收货人电话
	private String aaddr; //收货地址
	private String aemail; //送货邮箱
	private User user; //用户信息 外键
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int uid, String aname, String atel, String aaddr, String aemail, User user) {
		super();
		this.uid = uid;
		this.aname = aname;
		this.atel = atel;
		this.aaddr = aaddr;
		this.aemail = aemail;
		this.user = user;
	}
	public Address(int aid, int uid, String aname, String atel, String aaddr, String aemail, User user) {
		super();
		this.aid = aid;
		this.uid = uid;
		this.aname = aname;
		this.atel = atel;
		this.aaddr = aaddr;
		this.aemail = aemail;
		this.user = user;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", uid=" + uid + ", aname=" + aname + ", atel=" + atel + ", aaddr=" + aaddr
				+ ", aemail=" + aemail + "]";
	}

}
