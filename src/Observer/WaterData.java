package Observer;

import java.util.ArrayList;
import java.util.List;

public class WaterData implements Subject {
	private List<Observer> observerList;
	private int x;
	private int y;
	private int z;
	public WaterData() {
		observerList = new ArrayList<>();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observerList.remove(o);
	}
	
	public void setWaterData(int x,int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		waterDataChanged();
	}
	
	public void waterDataChanged() {
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observerList) {
			o.update(x,y,z);
		}
	}

}
