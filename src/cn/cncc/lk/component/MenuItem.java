package cn.cncc.lk.component;

public class MenuItem extends MenuComponent {
	String name;
	double price;
	
	public MenuItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public void print() {
		System.out.println(getName() + "---" + getPrice() + "$");
	}
}
