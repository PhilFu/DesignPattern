package com.designPattern.builder;

public class FatBuilder implements Builder {

	private Product product = new Product();
	
	@Override
	public void buildHead() {
		product.add("Fat head");
	}

	@Override
	public void buildBody() {
		product.add("Fat body");
	}

	@Override
	public void buildHand() {
		product.add("Fat hand");
	}

	@Override
	public void buildFeet() {
		product.add("Fat feet");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
