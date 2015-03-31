package com.designPattern.proxy;

/**
 * Sometimes we cann't operate a object directly, but we need to interact with
 * it, then we can use proxy to instead that object For example: a very big
 * picture, it will cost a lot of time to open it within a document, we can use
 * a proxy to instead it, and open the document immediately.
 * 
 * @author DeBen
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		AbstractObject obj = new ProxyObject();
		obj.operation();
	}

}
