package domain;

import java.io.Serializable;

public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int carid;
	private int num;
	private Product product;
	private User user;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Car(int num, Product product) {
		super();
		this.num = num;
		this.product = product;
	}



	public Car(int carid, int num, Product product, User user) {
		super();
		this.carid = carid;
		this.num = num;
		this.product = product;
		this.user = user;
	}



	public Car(int num, Product product, User user) {
		super();
		this.num = num;
		this.product = product;
		this.user = user;
	}



	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
		return "Car [carid=" + carid + ", num=" + num + ", product=" + product + ", user=" + user + "]";
	}

	
}
