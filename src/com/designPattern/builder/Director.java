package com.designPattern.builder;

public class Director {
	public void construct(Builder build) {
		build.buildHead();
		build.buildBody();
		build.buildHand();
		build.buildFeet();
	}
}
