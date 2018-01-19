package complex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class Duck implements Observable{
	
	ArrayList list = new ArrayList();
		
	Quackable quackable;
	
	String name;
	
	public void quack() {
		quackable.quack();		
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
