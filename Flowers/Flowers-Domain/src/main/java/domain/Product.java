package domain;

import java.io.Serializable;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pid;
	private String pname; // 商品名
	private int pstate; // 0为销售，1为下架，2为推荐
	private String pinfo; // 商品描述
	private double pcost; // 商品价格
	private int psnum; // 商品销售数量
	private int prnum; // 商品库存数量
	private double insertCost; // 商品进货价
	private Type type; // 商品类别，外键
	private Kind kind; // 商品种类，外键
	private Picture picture; // 图片，外键
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String pname, double pcost, Picture picture) {
		super();
		this.pname = pname;
		this.pcost = pcost;
		this.picture = picture;
	}

	public Product(String pname, double pcost) {
		super();
		this.pname = pname;
		this.pcost = pcost;
	}

	public Product(String pname) {
		super();
		this.pname = pname;
	}

	public Product(String pname, int pstate, String pinfo, double pcost, int psnum, int prnum, double insertCost,
			Type type, Kind kind, Picture picture) {
		super();
		this.pname = pname;
		this.pstate = pstate;
		this.pinfo = pinfo;
		this.pcost = pcost;
		this.psnum = psnum;
		this.prnum = prnum;
		this.insertCost = insertCost;
		this.type = type;
		this.kind = kind;
		this.picture = picture;
	}
	public Product(int pid, String pname, int pstate, String pinfo, double pcost, int psnum, int prnum,
			double insertCost, Type type, Kind kind, Picture picture) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pstate = pstate;
		this.pinfo = pinfo;
		this.pcost = pcost;
		this.psnum = psnum;
		this.prnum = prnum;
		this.insertCost = insertCost;
		this.type = type;
		this.kind = kind;
		this.picture = picture;
	}
	
	public Product(int pid, String pname, int pstate, String pinfo, double pcost, int psnum, int prnum,
			double insertCost, Type type, Kind kind) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pstate = pstate;
		this.pinfo = pinfo;
		this.pcost = pcost;
		this.psnum = psnum;
		this.prnum = prnum;
		this.insertCost = insertCost;
		this.type = type;
		this.kind = kind;
	}
	public void getPid(int pid) {
		// TODO Auto-generated method stub
		this.pid=pid;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPstate() {
		return pstate;
	}
	public void setPstate(int pstate) {
		this.pstate = pstate;
	}
	public String getPinfo() {
		return pinfo;
	}
	public void setPinfo(String pinfo) {
		this.pinfo = pinfo;
	}
	public double getPcost() {
		return pcost;
	}
	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	public int getPsnum() {
		return psnum;
	}
	public void setPsnum(int psnum) {
		this.psnum = psnum;
	}
	public int getPrnum() {
		return prnum;
	}
	public void setPrnum(int prnum) {
		this.prnum = prnum;
	}
	public double getInsertCost() {
		return insertCost;
	}
	public void setInsertCost(double insertCost) {
		this.insertCost = insertCost;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pstate=" + pstate + ", pinfo=" + pinfo + ", pcost="
				+ pcost + ", psnum=" + psnum + ", prnum=" + prnum + ", insertCost=" + insertCost + ", type=" + type
				+ ", kind=" + kind + ", picture=" + picture + "]";
	}

	

	

	
	
}
