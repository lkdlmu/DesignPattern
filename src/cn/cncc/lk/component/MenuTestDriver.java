package cn.cncc.lk.component;

public class MenuTestDriver {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("Breakfast");
		MenuComponent dinerMenu = new Menu("Lunch");
		MenuComponent cafeMenu = new Menu("Dinner");
		MenuComponent dessertMenu = new Menu("Dessert");
		
		MenuComponent allMenus = new Menu("All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		pancakeHouseMenu.add(new MenuItem("K&B's Panacake Breakfast", 2.99));
		dinerMenu.add(new MenuItem("Hotdog", 3.05));
		cafeMenu.add(new MenuItem("Soup of the day", 3.69));
		
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie", 1.59));
		
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();
		
	}

}
