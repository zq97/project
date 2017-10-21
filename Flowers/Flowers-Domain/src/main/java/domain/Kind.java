package domain;

public class Kind {
	private int kid;
	private String tname;
	public Kind() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kind(String tname) {
		super();
		this.tname = tname;
	}
	public Kind(int kid, String tname) {
		super();
		this.kid = kid;
		this.tname = tname;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Kind [kid=" + kid + ", tname=" + tname + "]";
	}
	

}
