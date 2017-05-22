package cn.cncc.lk.abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Clam createClam() {
		return new FreshClam();
	}

}
