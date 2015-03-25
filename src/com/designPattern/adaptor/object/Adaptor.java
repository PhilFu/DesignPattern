package com.designPattern.adaptor.object;

public class Adaptor implements Target {

	private Adaptee adaptee = new Adaptee();

	@Override
	public void adaptOperation() {
		adaptee.operation();
	}
}
