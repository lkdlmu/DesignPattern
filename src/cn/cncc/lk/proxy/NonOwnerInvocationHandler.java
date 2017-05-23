package cn.cncc.lk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

	PersonBean person;
	
	public NonOwnerInvocationHandler(PersonBean person) {
		super();
		this.person = person;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) {
		String methodName = method.getName();
		try {
			if (methodName.startsWith("get")) {
				return method.invoke(person, args);
			} else if (methodName.equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else if (methodName.startsWith("set")) {
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("You can't change other's information!");
		}
		return null;
	}

}
