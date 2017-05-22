package cn.cncc.lk.abstractfactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}
	
	void prepare() {
		System.out.println("Preparing " + name);
		sauce = factory.createSauce();
	}

}
