package com.designPattern.adaptor.object;

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
