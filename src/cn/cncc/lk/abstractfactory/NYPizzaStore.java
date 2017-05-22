package cn.cncc.lk.abstractfactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setName("New York Cheese Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(factory);
			pizza.setName("New York Clam Pizza");
		}
		return pizza;
	}

}
