package com.designPattern.Decorator;

/**
 * Concrete Component
 * This is the base object, that will receive decorators
 * 
 * @author DeBen
 *
 */
public class Monkey implements TheGreatestSage {

	@Override
	public void move() {
		System.out.println("A monkey born");
	}

}
