package iterator;

public class MenuItem {
	private String name ;
	private double price;
	private boolean isVegetarian;
	public MenuItem(String name, double price, boolean isVegetarian) {
		this.name = name;
		this.price = price;
		this.isVegetarian = isVegetarian;
	}
	
	
	
	public String getName() {
		return name;
	}



	public double getPrice() {
		return price;
	}



	public boolean isVegetarian() {
		return isVegetarian;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "," + price + "," + (isVegetarian ? "Vegetarian" : "Meat");
	}
	
}
