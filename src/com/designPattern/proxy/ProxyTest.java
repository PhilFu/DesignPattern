package com.designPattern.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		AbstractObject obj = new ProxyObject();
		obj.operation();
	}

}
