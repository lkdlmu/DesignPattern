package cn.cncc.lk.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	String menuName;
	MenuItem[] menuItems;
	
	public DinerMenu(String menuName) {
		menuItems = new MenuItem[MAX_ITEMS];
		this.menuName = menuName;
		addItem("Vegetarian BLT", 2.99);
		addItem("Bacon with lettuce", 2.99);
		addItem("Hotdog", 3.05);
	}

	private void addItem(String name, double price) {
		MenuItem menuItem = new MenuItem(name, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full!");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
	
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	
	public String getMenuName() {
		return menuName;
	}
	
	public Iterator createIterator() {
		return new DinerMenuItemIterator(menuItems);
	}
}
