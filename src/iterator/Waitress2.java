package iterator;

import java.util.List;
import java.util.Iterator;
public class Waitress2 {
	
	private Menu menu_1;
	private Menu menu_2;
//	private MenuItem[] menu1Items;  //����Ҫ�ܾ������menu��ʵ��  �����������黹��List�������������ݽṹ
//	private List menu2Items;
	Waitress2(Menu menu_1,Menu menu_2){  //ͳһmenu�ӿڣ�����Ա����Ҫȥ�ܴ�������ĸ�menu,ֻҪ��menu�Ϳ���
		this.menu_1 = menu_1;
		//menu1Items = menu_1.getMenuItem();
		this.menu_2 = menu_2;
		//menu2Items = menu_2.getMenuItem();		
	}
	public void printMenu() {
		Iterator iterator_1 = menu_1.createIterator();
		printMenu(iterator_1);
		Iterator iterator_2 = menu_2.createIterator();
		printMenu(iterator_2);
		//����ÿ��menu����һ��forѭ���ı��� �����һ��menu ��Ҫ����menuʵ�ֵ����ݽṹдһ��forѭ��
//		for(int i = 0 ; i < menu1Items.length ; i++) {
//			MenuItem item = menu1Items[i];
//			System.out.print("name :" + item.getName());
//			System.out.print(" price :" + item.getPrice());
//			System.out.println(" Vegetarian or Meat :" + (item.isVegetarian() ? "Y" : "N"));
//		}
//		
//		for(int i = 0 ; i < menu2Items.size() ; i++) {
//			MenuItem item = (MenuItem)menu2Items.get(i);
//			System.out.print("name :" + item.getName());
//			System.out.print(" price :" + item.getPrice());
//			System.out.println(" Vegetarian or Meat :" + (item.isVegetarian() ? "Y" : "N"));
//		}
	}
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem item = (MenuItem)iterator.next();
			System.out.print("name :" + item.getName());
			System.out.print(" price :" + item.getPrice());
			System.out.println(" Vegetarian or Meat :" + (item.isVegetarian() ? "Y" : "N"));
		}
	}
}
