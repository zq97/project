package domain;

public class Picture {
	private int piid;
	private String piname;
	private String piaddress;
	public Picture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Picture(String piname, String piaddress) {
		super();
		this.piname = piname;
		this.piaddress = piaddress;
	}
	public Picture(int piid, String piname, String piaddress) {
		super();
		this.piid = piid;
		this.piname = piname;
		this.piaddress = piaddress;
	}
	public int getPiid() {
		return piid;
	}
	public void setPiid(int piid) {
		this.piid = piid;
	}
	public String getPiname() {
		return piname;
	}
	public void setPiname(String piname) {
		this.piname = piname;
	}
	public String getPiaddress() {
		return piaddress;
	}
	public void setPiaddress(String piaddress) {
		this.piaddress = piaddress;
	}
	@Override
	public String toString() {
		return "Picture [piid=" + piid + ", piname=" + piname + ", piaddress=" + piaddress + "]";
	}

}
