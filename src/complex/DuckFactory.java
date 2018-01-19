package complex;

public class DuckFactory extends AbstratDuckFactory{

	@Override
	public Duck createDuck_1() {
		// TODO Auto-generated method stub
		//return new DuckDecorator(new Duck_1()); //装饰者模式
		return new Duck_1(); //观察者模式
	}

	@Override
	public Duck createDuck_2() {
		// TODO Auto-generated method stub
		//return new DuckDecorator(new Duck_2());
		return new Duck_2();
	}

}
