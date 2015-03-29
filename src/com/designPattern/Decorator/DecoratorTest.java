package com.designPattern.Decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		TheGreatestSage sage = new Monkey();

		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(bird);

		fish.move();
	}

}
