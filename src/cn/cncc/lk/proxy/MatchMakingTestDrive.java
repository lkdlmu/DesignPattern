package cn.cncc.lk.proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * 动态代理
 * */

public class MatchMakingTestDrive {
	
	Map<String, PersonBean> personDataMap;

	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
	
	public MatchMakingTestDrive() {
		initData();
	}
	
	public void initData() {
		personDataMap = new HashMap<String, PersonBean>();
		PersonBean joe = new PersonBeanImpl("Joe", "Bowling");
		PersonBean lucy = new PersonBeanImpl("Lucy", "Skiing");
		
		personDataMap.put(joe.getName(), joe);
		personDataMap.put(lucy.getName(), lucy);
	}
	
	public void drive() {
		PersonBean joe = personDataMap.get("Joe");
		PersonBean ownProxy = getOwnProxy(joe);
		System.out.println("My name is " + ownProxy.getName());
		ownProxy.setInterests("Bowling, Hiking");
		System.out.println("My insterests are " + ownProxy.getName());
		ownProxy.setHotOrNotRating(10);
		
		System.out.println();
		
		PersonBean lucy = personDataMap.get("Lucy");
		PersonBean noOwnProxy = getNonOwnProxy(lucy);
		System.out.println("My name is " + noOwnProxy.getName());
		noOwnProxy.setInterests("Bowling, Hiking");
		
	}

	private PersonBean getOwnProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
	
	private PersonBean getNonOwnProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

}
