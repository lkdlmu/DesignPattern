package cn.cncc.lk.singleton;

/**
 * 急切实例化
 * */
public class Singleton2 {
	private static Singleton2 uniqueInstance = new Singleton2();
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		return uniqueInstance;
	}
}
