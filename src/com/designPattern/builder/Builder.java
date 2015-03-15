package com.designPattern.builder;

public interface Builder {
	public void buildHead();
	public void buildBody();
	public void buildHand();
	public void buildFeet();
	public Product getProduct();
}
