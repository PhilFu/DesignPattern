package com.designPattern.builder;

public class BuilderTest {

	public static void main(String[] args) {
		Builder fatMan = new FatBuilder();
		Builder thinMan = new ThinBuilder();
		Director director = new Director();
		
		director.construct(fatMan);
		Product p1 = fatMan.getProduct();
		p1.show();
		
		director.construct(thinMan);
		Product p2 = thinMan.getProduct();
		p2.show();
	}

}
