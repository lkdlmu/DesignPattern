package cn.cncc.lk.iterator;

import java.util.ArrayList;

public class MenuTestDriver {
	public static void main(String[] args) {
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(new PancakeHouseMenu("BREAKFAST"));
		menus.add(new DinerMenu("LUNCH"));
		menus.add(new CafeMenu("DINNER"));
		
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}
