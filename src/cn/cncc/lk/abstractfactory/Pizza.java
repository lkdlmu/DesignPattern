package cn.cncc.lk.abstractfactory;

public abstract class Pizza {
	
	String name;
	Sauce sauce;
	Clam clam;

	abstract void prepare();

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
	
	public void setName(String name) {
		this.name = name;
	}

}
