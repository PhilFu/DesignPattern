package com.designPattern.Singleton;

/**
 * Another way of thread safe singleton.
 * createInstance() was synchronized, so it is thread safe, and only the first time when singleton was null, we need to call createInstance(),
 * it will be much more efficient than synchronized getInstance();
 * 
 * @author DeBen
 *
 */
public class LazySingleton2 {
	private static LazySingleton2 singleton;
	
	private LazySingleton2() {
		
	}
	
	public static LazySingleton2 getInstance() {
		if (singleton == null) {
			singleton = createInstance();
		}
		return singleton;
	}
	
	private static synchronized LazySingleton2 createInstance() {
		if (singleton == null) {
			singleton = new LazySingleton2();
		}
		return singleton;
	}
}
