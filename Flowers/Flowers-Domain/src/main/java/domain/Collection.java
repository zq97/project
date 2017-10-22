package domain;

public class Collection {
	private int colid;
	private int uid;
	private int pid;

	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection(int colid, int uid, int pid) {
		super();
		this.colid = colid;
		this.uid = uid;
		this.pid = pid;
	}

	public Collection(int uid, int pid) {
		super();
		this.uid = uid;
		this.pid = pid;
	}

	public int getColid() {
		return colid;
	}

	public void setColid(int colid) {
		this.colid = colid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Collection [colid=" + colid + ", uid=" + uid + ", pid=" + pid + "]";
	}

}
