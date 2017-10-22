package domain;

public class Product {
	private int pid;
	private String pname;    //商品名
	private int pstate;  //0为销售，1为下架，2为推荐
	private int tid;     //商品类别id，外键
	private String pinfo;   //商品描述
	private int psimg;   //小图片，外键
	private int pbimg;    //大图片，外键
	private double pcost;    //商品价格
	private int psnum;   //商品销售数量
	private int prnum;    //商品库存数量
	private int kid;      //商品种类，外键
	private double insertCost;    //商品进货价
	public Product() {
		super();
	}
	public Product(String pname, int pstate, int tid, String pinfo, int psimg, int pbimg, double pcost, int psnum,
			int prnum, int kid, double insertCost, Type type, Kind kind, Picture picture) {
		super();
		this.pname = pname;
		this.pstate = pstate;
		this.tid = tid;
		this.pinfo = pinfo;
		this.psimg = psimg;
		this.pbimg = pbimg;
		this.pcost = pcost;
		this.psnum = psnum;
		this.prnum = prnum;
		this.kid = kid;
		this.insertCost = insertCost;
			}
	public Product(int pid, String pname, int pstate, int tid, String pinfo, int psimg, int pbimg, double pcost,
			int psnum, int prnum, int kid, double insertCost, Type type, Kind kind, Picture picture) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pstate = pstate;
		this.tid = tid;
		this.pinfo = pinfo;
		this.psimg = psimg;
		this.pbimg = pbimg;
		this.pcost = pcost;
		this.psnum = psnum;
		this.prnum = prnum;
		this.kid = kid;
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
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getPinfo() {
		return pinfo;
	}
	public void setPinfo(String pinfo) {
		this.pinfo = pinfo;
	}
	public int getPsimg() {
		return psimg;
	}
	public void setPsimg(int psimg) {
		this.psimg = psimg;
	}
	public int getPbimg() {
		return pbimg;
	}
	public void setPbimg(int pbimg) {
		this.pbimg = pbimg;
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
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public double getInsertCost() {
		return insertCost;
	}
	public void setInsertCost(double insertCost) {
		this.insertCost = insertCost;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pstate=" + pstate + ", tid=" + tid + ", pinfo=" + pinfo
				+ ", psimg=" + psimg + ", pbimg=" + pbimg + ", pcost=" + pcost + ", psnum=" + psnum + ", prnum=" + prnum
				+ ", kid=" + kid + ", insertCost=" + insertCost + "]";
	}
	
	
	

}
