package com.designPattern.adaptor.object;

public class AdaptorTest {
	public static void main(String[] args) {
		Target tar = new Adaptor();
		tar.adaptOperation();
		tar.operation();
	}
}
