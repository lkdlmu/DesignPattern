package cn.cncc.lk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

	PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {
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
				throw new IllegalAccessException();
			} else if (methodName.startsWith("set")) {
				return method.invoke(person, args);
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("You can't rating yourself!");
		}
		return null;
	}

}
