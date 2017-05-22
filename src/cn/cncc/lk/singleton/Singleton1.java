package cn.cncc.lk.singleton;

/**
 * 同步getInstance()方法 确保多线程访问时也只创建单个对象
 * 同步会降低性能
 * */
public class Singleton1 {
	private static Singleton1 uniqueInstance;
	
	private Singleton1() {}
	
	public static synchronized Singleton1 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton1();
		}
		return uniqueInstance;
	}
}
