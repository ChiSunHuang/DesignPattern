package iterator;

public class TestMenu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu1 menu_1 = new Menu1();
		MenuItem[] items = menu_1.getMenuItem();
		for(MenuItem item : items) {
			System.out.println(item);
		}
	}

}
