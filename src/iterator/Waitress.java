package iterator;

import java.util.List;

public class Waitress {
	
	private Menu1 menu_1;
	private Menu2 menu_2;
	private MenuItem[] menu1Items;
	private List menu2Items;
	
	Waitress(){
		menu_1 = new Menu1();
		menu1Items = menu_1.getMenuItem();
		menu_2 = new Menu2();
		menu2Items = menu_2.getMenuItem();
		
	}
	public void printMenu() {
		
		for(int i = 0 ; i < menu1Items.length ; i++) {
			MenuItem item = menu1Items[i];
			System.out.print("name :" + item.getName());
			System.out.print(" price :" + item.getPrice());
			System.out.println(" Vegetarian or Meat :" + (item.isVegetarian() ? "Y" : "N"));
		}
		
		for(int i = 0 ; i < menu2Items.size() ; i++) {
			MenuItem item = (MenuItem)menu2Items.get(i);
			System.out.print("name :" + item.getName());
			System.out.print(" price :" + item.getPrice());
			System.out.println(" Vegetarian or Meat :" + (item.isVegetarian() ? "Y" : "N"));
		}
	}
}
