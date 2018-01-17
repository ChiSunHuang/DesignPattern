package factory;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		//����ֻ�涨����
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
