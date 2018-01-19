package complex;

import java.util.Iterator;

public class GooseDuckAdapter extends Duck{
	
	Goose goose;

	public GooseDuckAdapter(Goose goose) {
		this.goose = goose;
		name = "faked duck real goose ";
	}
	
	public void quack() {
		goose.quack();
		notifyObservers();
	}
	
	public void registerObserver(Observer observer) {
		list.add(observer);
	}
	
	public void notifyObservers() {
		Iterator it =  list.iterator();
		while(it.hasNext()) {
			Observer observer = (Observer)it.next();
			observer.update(this);
		}
	}
}
