package iterator;

import java.util.List;

public class TestMenu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu2 menu_2 = new Menu2();
		List items = menu_2.getMenuItem();
		for(int i = 0 ; i < items.size() ; i++) {
			System.out.println(items.get(i));
		}
	}

}
