package com.designPattern.builder;

public class ThinBuilder implements Builder {

	private Product product = new Product();
	
	@Override
	public void buildHead() {
		product.add("Thin head");
	}

	@Override
	public void buildBody() {
		product.add("Thin body");
	}

	@Override
	public void buildHand() {
		product.add("Thin hand");
	}

	@Override
	public void buildFeet() {
		product.add("Thin feet");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
