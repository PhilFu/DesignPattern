package com.designPattern.Singleton;

/**
 * Lazy Mode. Thread safe, because only when getInstance() was called, the class SingletonHolder will be load.
 * As it is static class, this process is thread safe, and only one singleton will be created.
 * 
 * @author DeBen
 *
 */
public class LazySingleton {

	private LazySingleton() {
		
	}
	
	private static class SingletonHolder {
		private static LazySingleton singleton = new LazySingleton();
	}
	
	public static LazySingleton getInstance() {
		return SingletonHolder.singleton;
	}
}
