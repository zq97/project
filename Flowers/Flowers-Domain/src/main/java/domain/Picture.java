package domain;

import java.io.Serializable;

public class Picture implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int piid;
	private String piname;
	

	public Picture() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Picture(String piname) {
		super();
		this.piname = piname;
	}


	public Picture(int piid, String piname) {
		super();
		this.piid = piid;
		this.piname = piname;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Picture [piid=" + piid + ", piname=" + piname + "]";
	}

	

}
