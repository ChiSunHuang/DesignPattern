package adapter;

public class DuckAdapter implements Duck {
	
	private Bird m_bird;
	DuckAdapter(Bird bird){
		m_bird = bird;
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		m_bird.fly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		m_bird.chirp();
	}

}
