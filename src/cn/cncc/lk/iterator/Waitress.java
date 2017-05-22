package cn.cncc.lk.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	ArrayList menus;
	
	public Waitress(ArrayList menus) {
		super();
		this.menus = menus;
	}
	
	public void printMenu() {
		Iterator menuIterator = menus.iterator();
		System.out.println("MENU");
		while(menuIterator.hasNext()) {
			Menu menu = (Menu) menuIterator.next();
			printMenu(menu.getMenuName(), menu.createIterator());
		}
	}

	private void printMenu(String menuName, Iterator iterator) {
		System.out.println("\n" + menuName);
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + "---" + menuItem.getPrice() + "$");
		}
	}
}
