package com.designPattern.adaptor.classadaptor;

/**
 * If you want to change an class to another interface, use class adaptor,
 * create a new class, extends original and implements the new interface
 * 
 * @author DeBen
 *
 */
public class Adaptor extends Adaptee implements Target {

	@Override
	public void adaptOperation() {
		System.out.println("This is adapyor operation");
	}

}
