package com.designPattern.adaptor.classadaptor;

public class Adaptor extends Adaptee implements Target {

	@Override
	public void adaptOperation() {
		operation();
	}

}
