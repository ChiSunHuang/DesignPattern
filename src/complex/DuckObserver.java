package complex;

public class DuckObserver implements Observer{
	
	private static int DuckQuackTimes;
	
	@Override
	public void update(Duck duck) {
		// TODO Auto-generated method stub
		System.out.println(duck + " just quacked");
		DuckQuackTimes ++; //记录鸭子叫的总次数
	}
	
	public static int getDuckQuackTimes() {
		return DuckQuackTimes;
	}

}
