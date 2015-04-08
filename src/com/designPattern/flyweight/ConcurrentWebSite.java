package com.designPattern.flyweight;

/**
 * This is the concrete flyweight class
 * 
 * @author DeBen
 *
 */
public class ConcurrentWebSite extends WebSite {

	public ConcurrentWebSite(String type) {
		super(type);
	}

	@Override
	public void use(User user) {
		System.out.println("The WebSite type is: " + type);
		System.out.println("Username: " + user.getUsername());
		System.out.println("Password: " + user.getPassword());
		System.out.println();
	}

}
