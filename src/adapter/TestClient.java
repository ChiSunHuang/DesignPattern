package adapter;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ģʽ���ڿͻ���ֻ�ܵ���duck�ӿڵ������
		Bird bird = new LittleBird();   //��ҪһֻѼ�ӣ���������ֻ��һֻ��
		DuckAdapter duck = new DuckAdapter(bird); //ͨ������������ת����Ѽ��
		duck.fly();  //������ƭ���ͻ���
		duck.quack();
	}

}
