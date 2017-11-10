package domain;

import java.io.Serializable;

public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int carid;
	private Product product;
	private User user;
	private int num;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Product product, User user, int num) {
		super();
		this.product = product;
		this.user = user;
		this.num = num;
	}

	public Car(int carid, Product product, User user, int num) {
		super();
		this.carid = carid;
		this.product = product;
		this.user = user;
		this.num = num;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", product=" + product + ", user=" + user + ", num=" + num + "]";
	}
	
}
