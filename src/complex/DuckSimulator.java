package complex;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstratDuckFactory factory = new DuckFactory();		
		
		Flocks duckFlocks = new Flocks();
		Observer observer = new DuckObserver();
		
		Duck duck_1 = factory.createDuck_1();				
		//duck_1.registerObserver(observer);  //相当于观察者订阅多个主题

		Duck duck_2 = factory.createDuck_2();
		//duck_2.registerObserver(observer);//相当于观察者订阅多个主题
		

		//duckFlocks.quack();  //一整群鸭子看成一只鸭子
		
		
		//适配器模式
		Duck duck_3 = new GooseDuckAdapter(new Goose());
		
		//构建群，组合模式
		duckFlocks.add(duck_1);
		duckFlocks.add(duck_2);
		duckFlocks.add(duck_3);
		//duck_3.registerObserver(observer);//相当于观察者订阅多个主题
		
		duckFlocks.registerObserver(observer); //对一个群进行观察
		
		simulate(duckFlocks);
		
		System.out.println("total quack times of ducks is :" + DuckObserver.getDuckQuackTimes());
	}
	
	//不管是一整群鸭子还是一直鸭子，这个代码都可以用
	public static void simulate(Duck duck) {
		duck.quack();
	}
}
