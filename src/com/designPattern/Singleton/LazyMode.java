package com.designPattern.Singleton;

/**
 * Lazy Mode, but not thread safe
 * 
 * @author DeBen
 *
 */
public class LazyMode {
	private static LazyMode singleton;
	
	private LazyMode() {
		
	}
	
	public static LazyMode getInstance() {
		if (singleton == null) {
			singleton = new LazyMode();
		}
		return singleton;
	}
}
