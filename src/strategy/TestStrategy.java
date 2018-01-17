package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck_1 = new Duck1();
		duck_1.display();
		duck_1.fly();
		duck_1.quack();
		
		Duck duck_2 = new Duck2();
		duck_2.display();
		duck_2.fly();
		duck_2.quack();
		System.out.println("======= change toy and give it a rocket wings ======");
		duck_2.setFlyBehavior(new FlyWithRocket());
		duck_2.display();
		duck_2.fly();
	}

}
