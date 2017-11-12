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
	private Type type; // 商品类别，外键
	private String pinfo; // 商品描述
	private Picture picture; // 图片，外键
	private double pcost; // 商品价格
	private int psnum; // 商品销售数量
	private int prnum; // 商品库存数量
	private Kind kind; // 商品种类，外键
	private double insertCost; // 商品进货价

	public Product() {
		super();
	}

	public Product(String pname) {
		super();
		this.pname = pname;
	}

	public Product(int pid, String pname, int pstate, Type type, String pinfo, double pcost, int psnum, int prnum,
			Kind kind, double insertCost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pstate = pstate;
		this.type = type;
		this.pinfo = pinfo;
		this.pcost = pcost;
		this.psnum = psnum;
		this.prnum = prnum;
		this.kind = kind;
		this.insertCost = insertCost;
	}

	public Product(String pname, int pstate, Type type, String pinfo, Picture picture, double pcost, int psnum,
			int prnum, Kind kind, double insertCost) {
		super();
		this.pname = pname;
		this.pstate = pstate;
		this.type = type;
		this.pinfo = pinfo;
		this.picture = picture;
		this.pcost = pcost;
		this.psnum = psnum;
		this.prnum = prnum;
		this.kind = kind;
		this.insertCost = insertCost;
	}

	public Product(int pid, String pname, int pstate, Type type, String pinfo, Picture picture, double pcost, int psnum,
			int prnum, Kind kind, double insertCost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pstate = pstate;
		this.type = type;
		this.pinfo = pinfo;
		this.picture = picture;
		this.pcost = pcost;
		this.psnum = psnum;
		this.prnum = prnum;
		this.kind = kind;
		this.insertCost = insertCost;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getPinfo() {
		return pinfo;
	}

	public void setPinfo(String pinfo) {
		this.pinfo = pinfo;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
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

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public double getInsertCost() {
		return insertCost;
	}

	public void setInsertCost(double insertCost) {
		this.insertCost = insertCost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pstate=" + pstate + ", type=" + type + ", pinfo=" + pinfo
				+ ", picture=" + picture + ", pcost=" + pcost + ", psnum=" + psnum + ", prnum=" + prnum + ", kind="
				+ kind + ", insertCost=" + insertCost + "]";
	}
	

	
}
