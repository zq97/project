package domain;

import java.sql.Timestamp;


public class Comment {
	private int coid;
	private int uid;     //评论人id
	private int pid;     //商品id
	private Timestamp ctime;    //评论时间
	private String ccontent;    //评论内容
		public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(int uid, int pid, Timestamp ctime, String ccontent, User user, Product product) {
		super();
		this.uid = uid;
		this.pid = pid;
		this.ctime = ctime;
		this.ccontent = ccontent;
			}
	public Comment(int coid, int uid, int pid, Timestamp ctime, String ccontent, User user, Product product) {
		super();
		this.coid = coid;
		this.uid = uid;
		this.pid = pid;
		this.ctime = ctime;
		this.ccontent = ccontent;
		
	}
	public int getCoid() {
		return coid;
	}
	public void setCoid(int coid) {
		this.coid = coid;
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
	public Timestamp getCtime() {
		return ctime;
	}
	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
		@Override
	public String toString() {
		return "Comment [coid=" + coid + ", uid=" + uid + ", pid=" + pid + ", ctime=" + ctime + ", ccontent=" + ccontent
				+ "]";
	}

}
