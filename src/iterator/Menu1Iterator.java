package iterator;
import java.util.Iterator;
public class Menu1Iterator implements Iterator {
	private MenuItem[] menuItems;
	private int index;
	Menu1Iterator (MenuItem[] menuItems){
		this.menuItems = menuItems;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index >= menuItems.length) 
			return false;
		if(menuItems[index] == null)
			return false;
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return menuItems[index++];
	}

}
