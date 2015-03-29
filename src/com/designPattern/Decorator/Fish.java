package com.designPattern.Decorator;

/**
 * Concrete decorator
 * This ability will be add to the component, the move() method must call super.move() first
 * @author DeBen
 *
 */
public class Fish extends Change {

	public Fish(TheGreatestSage sage) {
		super(sage);
	}

	@Override
	public void move() {
		super.move();
		System.out.println("Fish move");
	}

}
