package factory;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("my pizza is " + pizza.name);
	}

}
