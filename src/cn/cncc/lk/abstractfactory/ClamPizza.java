package cn.cncc.lk.abstractfactory;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory factory;
	public ClamPizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		sauce = factory.createSauce();
		clam = factory.createClam();
	}

}
