package domain;

import java.io.Serializable;

public class Collection implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int colid;
	private User user;
	private Product product;

	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection(User user, Product product) {
		super();
		this.user = user;
		this.product = product;
	}

	public Collection(int colid, User user, Product product) {
		super();
		this.colid = colid;
		this.user = user;
		this.product = product;
	}

	public int getColid() {
		return colid;
	}

	public void setColid(int colid) {
		this.colid = colid;
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
		return "Collection [colid=" + colid + ", user=" + user + ", product=" + product + "]";
	}
	
}
