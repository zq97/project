package domain;


public class Car {
	private int carid;
	private int pid;
	private int num;
	private Product product;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int pid, int num, Product product) {
		super();
		this.pid = pid;
		this.num = num;
		this.product = product;
	}
	public Car(int carid, int pid, int num, Product product) {
		super();
		this.carid = carid;
		this.pid = pid;
		this.num = num;
		this.product = product;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	@Override
	public String toString() {
		return "Car [carid=" + carid + ", pid=" + pid + ", num=" + num + "]";
	}

}
