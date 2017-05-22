package cn.cncc.lk.factorymethod;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	

	void prepare() {
		System.out.println("Preparing " + name);
	}

	void bake() {
		System.out.println("Bake for 25 minutes");
	}

	void cut() {
		System.out.println("Cutting the pizza");
	}

	void box() {
		System.out.println("Place pizza in box");
	}
	
	public String getName() {
		return name;
	}

}
