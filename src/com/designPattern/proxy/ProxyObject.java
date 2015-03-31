package com.designPattern.proxy;

public class ProxyObject extends AbstractObject {

	RealObject object = new RealObject();

	@Override
	public void operation() {
		System.out.println("Before operation");
		object.operation();
		System.out.println("After operation");
	}

}
