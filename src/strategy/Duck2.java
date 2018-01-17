package strategy;

public class Duck2 extends Duck{
	//Duck2 is a toy duck
	
	Duck2(){
		this.flyBehavior = new FlyNOWay();
		this.quackBehavior = new QuackNOWay();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a toy duck ~");
	}

}
