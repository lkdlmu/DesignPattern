package cn.cncc.lk.iterator;

import java.util.Iterator;

public class DinerMenuItemIterator implements Iterator {

	MenuItem[] items;
	int position = 0;
	
	
	
	public DinerMenuItemIterator(MenuItem[] items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
