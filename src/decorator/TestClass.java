package decorator;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b1 = new DarkRoast();
		Beverage b2 = new MoCha(b1);
		Beverage b3 = new MoCha(b2);
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
	}

}
