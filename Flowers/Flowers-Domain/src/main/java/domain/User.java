package domain;

import java.sql.Date;

public class User {
	private int uid;
	private String uname;
	private String upwd;
	private String usex;
	private Date ubirthday;
	private int utype;   //0为商家，1为用户
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uname, String upwd, String usex, Date ubirthday, int utype) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.usex = usex;
		this.ubirthday = ubirthday;
		this.utype = utype;
	}
	public User(int uid, String uname, String upwd, String usex, Date ubirthday, int utype) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.usex = usex;
		this.ubirthday = ubirthday;
		this.utype = utype;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public Date getUbirthday() {
		return ubirthday;
	}
	public void setUbirthday(Date ubirthday) {
		this.ubirthday = ubirthday;
	}
	public int getUtype() {
		return utype;
	}
	public void setUtype(int utype) {
		this.utype = utype;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", usex=" + usex + ", ubirthday="
				+ ubirthday + ", utype=" + utype + "]";
	}
	

}
