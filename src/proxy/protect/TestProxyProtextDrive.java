package proxy.protect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestProxyProtextDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBean person_1 = new PersonBeanImpl("jack",0.00,"123456");
		PersonBean proxy = getOnwerProxy(person_1);
		System.out.println("name is " + proxy.getName());
		System.out.println("rating is " +  proxy.getRating());
		System.out.println("pwd is " + proxy.getPwd());
		System.out.println("======== setName =======");
		proxy.setName("rose");
		System.out.println("name is " + proxy.getName());
		System.out.println("======== setPwd ========");
		proxy.setPwd("testproxy");
		System.out.println("pwd is " + proxy.getPwd());
		System.out.println("======== setRating =======");
		try {
			proxy.setRating(5.00);		
		}catch(Exception e) {
			System.out.println("can't not set rating by yourself");
		}
	
	}
	
	private static PersonBean getOnwerProxy(PersonBean person) {
		return (PersonBean)Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(), getOnwerHandler(person));
	}
	private static InvocationHandler getOnwerHandler(PersonBean person) {
		return new OwnerInvocationHandler(person);
	}
}
