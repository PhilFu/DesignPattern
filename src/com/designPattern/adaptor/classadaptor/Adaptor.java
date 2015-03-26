package com.designPattern.adaptor.classadaptor;

public class Adaptor extends Adaptee implements Target {

	@Override
	public void adaptOperation() {
		System.out.println("This is adapyor operation");
	}

}
