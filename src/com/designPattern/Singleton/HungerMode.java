package com.designPattern.Singleton;

public class HungerMode {
	private static HungerMode singleton = new HungerMode();
	
	private HungerMode(){
		
	}
	
	public HungerMode getInstance() {
		return singleton;
	}
}
