package iterator;

import java.util.List;

public class Menu2Iterator implements Iterator {
	private List<MenuItem> menuItems;
	private int index;
	Menu2Iterator(List<MenuItem> menuItems){
		this.menuItems = menuItems;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index >= menuItems.size()) {
			return false;
		}
		return true;
	}
	@Override
	public Object next() {
		// TODO Auto-generated method stub		
		return menuItems.get(index ++);
	}

}
