package cn.cncc.lk.abstractfactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Clam createClam() {
		return new FrozenClam();
	}

}
