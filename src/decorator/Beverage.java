package decorator;

public abstract class Beverage {
	
	protected String description = "unkonwn description";
	protected double cost;
	public String getDescription() {
		return description;
	}
	
	protected double cost() {
		return cost;
	}
}
