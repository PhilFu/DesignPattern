package com.designPattern.adaptor.interfaceadaptor;

/**
 * If you want to change an object to another new interface, use this, create a
 * Wrapper class, use an instance of original class
 * 
 * @author DeBen
 *
 */
public class InterfaceAdaptorTest {

	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();

		source1.method1();
		source1.method2();

		source2.method1();
		source2.method2();
	}

}
