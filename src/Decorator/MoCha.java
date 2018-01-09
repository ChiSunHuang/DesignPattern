package Decorator;

public class MoCha extends CodimentDecorator{

	private Beverage mBeverage;
	
	MoCha(Beverage beverage) {
		mBeverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return mBeverage.getDescription() + " , Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mBeverage.cost() + 1.50;
	}

}
