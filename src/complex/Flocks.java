package complex;

import java.util.ArrayList;
import java.util.Iterator;



public class Flocks extends Duck{
	
	ArrayList<Duck> duckFlocks = new ArrayList<>();
	
	public void add(Duck duck) {
		duckFlocks.add(duck);
	}
	
	public void registerObserver(Observer observer) {
		//������ģʽ
		Iterator it = duckFlocks.iterator();
		while(it.hasNext()) {
			Duck duck = (Duck)it.next();
			duck.registerObserver(observer);
		}
	}
	
	public void quack() {
		//������ģʽ
		Iterator it = duckFlocks.iterator();
		while(it.hasNext()) {
			Duck duck = (Duck)it.next();
			duck.quack();
		}
	}
}
