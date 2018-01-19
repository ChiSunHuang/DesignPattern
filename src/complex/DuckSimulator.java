package complex;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstratDuckFactory factory = new DuckFactory();		
		
		Flocks duckFlocks = new Flocks();
		Observer observer = new DuckObserver();
		
		Duck duck_1 = factory.createDuck_1();				
		//duck_1.registerObserver(observer);  //�൱�ڹ۲��߶��Ķ������

		Duck duck_2 = factory.createDuck_2();
		//duck_2.registerObserver(observer);//�൱�ڹ۲��߶��Ķ������
		

		//duckFlocks.quack();  //һ��ȺѼ�ӿ���һֻѼ��
		
		
		//������ģʽ
		Duck duck_3 = new GooseDuckAdapter(new Goose());
		
		//����Ⱥ�����ģʽ
		duckFlocks.add(duck_1);
		duckFlocks.add(duck_2);
		duckFlocks.add(duck_3);
		//duck_3.registerObserver(observer);//�൱�ڹ۲��߶��Ķ������
		
		duckFlocks.registerObserver(observer); //��һ��Ⱥ���й۲�
		
		simulate(duckFlocks);
		
		System.out.println("total quack times of ducks is :" + DuckObserver.getDuckQuackTimes());
	}
	
	//������һ��ȺѼ�ӻ���һֱѼ�ӣ�������붼������
	public static void simulate(Duck duck) {
		duck.quack();
	}
}
