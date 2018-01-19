package complex;

public class DuckObserver implements Observer{
	
	private static int DuckQuackTimes;
	
	@Override
	public void update(Duck duck) {
		// TODO Auto-generated method stub
		System.out.println(duck + " just quacked");
		DuckQuackTimes ++; //��¼Ѽ�ӽе��ܴ���
	}
	
	public static int getDuckQuackTimes() {
		return DuckQuackTimes;
	}

}
