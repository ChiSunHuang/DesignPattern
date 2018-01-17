package strategy;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	//将具体的行为委托给多态的实例对象来完成
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}
	public abstract void display();
}
