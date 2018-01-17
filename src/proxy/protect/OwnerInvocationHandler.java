package proxy.protect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler{
	
	private PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {
		super();
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if(method.getName().equals("setRating")) {
			throw new Exception("you can't set rating");
		}else if(method.getName().startsWith("set")) {
			return method.invoke(person, args);
		}else if(method.getName().startsWith("get")){
			return method.invoke(person, args);
		}
		return null;
	}
}
