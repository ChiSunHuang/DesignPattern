package Factory.SimpleFactory;

public class NYStyleCheesePizza extends Pizza{
	
	NYStyleCheesePizza(){
		name = "NYStyleCheesePizza";
		source = "tomato";
		price = 20.00;
		toppings.add("beaf,cheese");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("NYStyleCheesePizza is cut");
	}
	
}
