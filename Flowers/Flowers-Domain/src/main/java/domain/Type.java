package domain;

import java.io.Serializable;

public class Type implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tid;
	private String tname;
	public Type() {
		super();
	}
	public Type(String tname) {
		super();
		this.tname = tname;
	}
	public Type(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + "]";
	}
	

}
