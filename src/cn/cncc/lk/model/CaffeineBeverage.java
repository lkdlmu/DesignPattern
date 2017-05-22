package cn.cncc.lk.model;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	boolean customerWantsCondiments() {
		return true;
	}

	abstract void addCondiments();
	abstract void brew();

	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("pouring into cup");
	}

}
