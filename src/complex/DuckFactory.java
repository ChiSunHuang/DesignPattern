package complex;

public class DuckFactory extends AbstratDuckFactory{

	@Override
	public Duck createDuck_1() {
		// TODO Auto-generated method stub
		//return new DuckDecorator(new Duck_1()); //װ����ģʽ
		return new Duck_1(); //�۲���ģʽ
	}

	@Override
	public Duck createDuck_2() {
		// TODO Auto-generated method stub
		//return new DuckDecorator(new Duck_2());
		return new Duck_2();
	}

}
