package domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Comment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int coid;
	private User user; // 评论人,外键
	private Product product; // 商品，外键
	private Timestamp ctime; // 评论时间
	private String ccontent; // 评论内容

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(User user, Product product, Timestamp ctime, String ccontent) {
		super();
		this.user = user;
		this.product = product;
		this.ctime = ctime;
		this.ccontent = ccontent;
	}

	public Comment(int coid, User user, Product product, Timestamp ctime, String ccontent) {
		super();
		this.coid = coid;
		this.user = user;
		this.product = product;
		this.ctime = ctime;
		this.ccontent = ccontent;
	}

	public int getCoid() {
		return coid;
	}

	public void setCoid(int coid) {
		this.coid = coid;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Comment [coid=" + coid + ", user=" + user + ", product=" + product + ", ctime=" + ctime + ", ccontent="
				+ ccontent + "]";
	}
	
}
