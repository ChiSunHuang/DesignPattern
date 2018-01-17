package strategy;

public class Duck1 extends Duck{
	//Duck1 can fly and quack like normal duck
	//由类的组合来控制鸭子的行为，而不是用继承。
	Duck1(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new QuackLikeNormal();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a normal duck");
	}

}
