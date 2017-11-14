package domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Comment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int coid;
	private Timestamp ctime; // 评论时间
	private String ccontent; // 评论内容
	private User user; // 评论人,外键
	private Product product; // 商品，外键
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(Timestamp ctime, String ccontent, User user, Product product) {
		super();
		this.ctime = ctime;
		this.ccontent = ccontent;
		this.user = user;
		this.product = product;
	}
	public Comment(int coid, Timestamp ctime, String ccontent, User user, Product product) {
		super();
		this.coid = coid;
		this.ctime = ctime;
		this.ccontent = ccontent;
		this.user = user;
		this.product = product;
	}
	public int getCoid() {
		return coid;
	}
	public void setCoid(int coid) {
		this.coid = coid;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Comment [coid=" + coid + ", ctime=" + ctime + ", ccontent=" + ccontent + ", user=" + user + ", product="
				+ product + "]";
	}

	
}
