package iterator;
import java.util.Iterator;
public class Menu1 implements Menu {
	private final static int MENU_NUM = 3;
	private MenuItem[] menuItems = new MenuItem[MENU_NUM];
	private int index;
	Menu1() {
		addMenuItem("beef",10.00,false);
		addMenuItem("salad",5.00,true);
		addMenuItem("chicken",8.00,false);
	}
	private void addMenuItem(String name,double price,boolean isVegetarian) {
		if(index >= MENU_NUM) {
			return;
		}
		MenuItem item = new MenuItem(name,price,isVegetarian);
		menuItems[index++] = item;		
	}
	public MenuItem[] getMenuItem() {
		return menuItems;
	}
	public Iterator createIterator() {
		return new Menu1Iterator(menuItems);
	}
}
