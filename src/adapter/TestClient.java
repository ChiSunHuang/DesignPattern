package adapter;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//这种设计模式用在客户端只能调用duck接口的情况下
		Bird bird = new LittleBird();   //想要一只鸭子，但是手里只有一只鸟
		DuckAdapter duck = new DuckAdapter(bird); //通过适配器将鸟转换成鸭子
		duck.fly();  //这里欺骗过客户端
		duck.quack();
	}

}
