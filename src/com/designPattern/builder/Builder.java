package com.designPattern.builder;

/**
 * Factory is a pattern that could create a single class, but builder is to
 * manage many different product hence to produce complex object. Complex object
 * is an class that contain different properties. Therefore, the difference
 * between factory and builder is that: factory focus on creating a single
 * product, builder focus on creating complex object with multiple part.
 * 
 * @author DeBen
 *
 */
public interface Builder {
	public void buildHead();

	public void buildBody();

	public void buildHand();

	public void buildFeet();

	public Product getProduct();
}
