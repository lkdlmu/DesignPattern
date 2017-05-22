package cn.cncc.lk.abstractfactory;

public class PizzaTestDriver {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza1 = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza1.getName() + "\n");
		
		System.out.println("--------------------");
		
		Pizza pizza2 = chicagoStore.orderPizza("clam");
		System.out.println("Joel orderd a " + pizza2.getName());
	}

}
