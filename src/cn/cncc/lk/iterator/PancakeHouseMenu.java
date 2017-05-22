package cn.cncc.lk.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
	String menuName;
	ArrayList menuItems;
	
	public PancakeHouseMenu(String menuName) {
		this.menuName = menuName;
		menuItems = new ArrayList();
		
		addItem("K&B's Panacake Breakfast", 2.99);
		addItem("Regular Pancake Breakfast", 2.99);
		addItem("Waffles", 3.59);
	}

	private void addItem(String name, double price) {
		MenuItem menuItem = new MenuItem(name, price);
		menuItems.add(menuItem);
	}
	
//	public ArrayList getMenuItems() {
//		return menuItems;
//	}
	
	public String getMenuName() {
		return menuName;
	}
	
	public Iterator createIterator() {
		return menuItems.iterator();
	}
}
