package Observer;

public class DisplayDevice implements Observer {
	Subject mWaterData;
	
	DisplayDevice (Subject waterData){
		this.mWaterData = waterData;
		this.mWaterData.registerObserver(this);
	}
	
	@Override
	public void update(int x, int y, int z) {
		// TODO Auto-generated method stub
		System.out.println("display: x -->" + x + " y -->" + y + " z -->" + z);
	}

}
