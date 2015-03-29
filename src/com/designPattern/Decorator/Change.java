package com.designPattern.Decorator;

/**
 * Decorator
 * hold an instance of component, and have the same method as component
 * 
 * @author DeBen
 *
 */
public class Change implements TheGreatestSage {

	private TheGreatestSage sage;

	public Change(TheGreatestSage sage) {
		this.sage = sage;
	}

	@Override
	public void move() {
		sage.move();
	}

}
