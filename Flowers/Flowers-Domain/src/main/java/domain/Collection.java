package domain;

import java.io.Serializable;

public class Collection implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int colid;
	private Product product;
	private User user;
	
	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collection(Product product, User user) {
		super();
		this.product = product;
		this.user = user;
	}
	public Collection(int colid, Product product, User user) {
		super();
		this.colid = colid;
		this.product = product;
		this.user = user;
	}
	public int getColid() {
		return colid;
	}
	public void setColid(int colid) {
		this.colid = colid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Collection [colid=" + colid + ", product=" + product + ", user=" + user + "]";
	}
	

	
}
