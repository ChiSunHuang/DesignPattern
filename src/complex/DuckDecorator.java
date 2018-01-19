package complex;

public class DuckDecorator extends Duck{
	
	Duck duck;
	
	private static int quackTotalCount = 0;
	
	public DuckDecorator(Duck duck) {
		super();
		this.duck = duck;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		quackTotalCount ++;
	}
	
	public static int getQuackTotalCount() {
		return quackTotalCount;
	}
}
