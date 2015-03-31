package com.designPattern.proxy;

public class RealObject extends AbstractObject {

	@Override
	public void operation() {
		System.out.println("Some operation");
	}

}
