package cn.cncc.lk.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
	String menuName;
	Hashtable menuItems = new Hashtable();
	
	public CafeMenu(String menuName) {
		this.menuName = menuName;
		addItem("Veggie Burger", 3.99);
		addItem("Soup of the day", 3.69);
		addItem("Burrito", 4.29);
	}
	
	private void addItem(String name, double price) {
		MenuItem menuItem = new MenuItem(name, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
	
	public String getMenuName() {
		return menuName;
	}

}
