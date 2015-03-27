package com.designPattern.adaptor.object;

/**
 * If you don't want to implements all methods in an interface, you could create
 * an abstract Wrapper class that implements the interface, then just extends
 * this abstract class.
 * 
 * @author DeBen
 *
 */
public class Adaptor implements Target {

	private Adaptee adaptee = new Adaptee();

	@Override
	public void adaptOperation() {
		System.out.println("This is adaptor operation");
	}

	@Override
	public void operation() {
		adaptee.operation();
	}
}
