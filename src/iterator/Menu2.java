package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Menu2 implements Menu {
	private List<MenuItem> menuItems;
	Menu2(){
		menuItems = new ArrayList();
		addMenuItem("cake",6.00,true);
		addMenuItem("pizza",7.00,false);
		addMenuItem("hamburger",8.00,false);
	}
	
	private void addMenuItem(String name,double price,boolean isVegetarian) {
		MenuItem item = new MenuItem(name,price,isVegetarian);
		menuItems.add(item);		
	}
	public List getMenuItem() {
		return menuItems;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		//return new Menu2Iterator(menuItems);
		return  menuItems.iterator();  //list的iterator JAVA中已经内置了
	}
}
