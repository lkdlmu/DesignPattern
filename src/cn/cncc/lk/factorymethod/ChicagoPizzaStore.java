package cn.cncc.lk.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCHeesePizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else return null;
	}

}
