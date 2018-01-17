package factory;

import java.util.ArrayList;

public class Pizza {
	public String name;
	public String source;
	public Double price;
	public ArrayList<String> toppings ;

	Pizza(){
		toppings = new ArrayList<>();
	}
	public void prepare() {
		System.out.println("create a pizza :" + name);
		System.out.println("source is :" + source);
		System.out.println("price is :" + price);
		System.out.print("toppings is :");
		for(String s : toppings) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	public void bake() {
		System.out.println("pizza bake for 20 min");
	}
	public void cut() {
		System.out.println("pizza cut");
	}
	public void box() {
		System.out.println("pizza put into a box");
	}
}
