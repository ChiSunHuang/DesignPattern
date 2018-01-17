package strategy;

public class Duck1 extends Duck{
	//Duck1 can fly and quack like normal duck
	//��������������Ѽ�ӵ���Ϊ���������ü̳С�
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
