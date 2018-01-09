package iterator;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waitress2 mWaitress = new Waitress2(new Menu1(),new Menu2());
		mWaitress.printMenu();
	}

}
