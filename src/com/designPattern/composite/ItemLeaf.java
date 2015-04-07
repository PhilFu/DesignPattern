package com.designPattern.composite;

public class ItemLeaf extends MenuComponent {

	public ItemLeaf(String name) {
		this.name = name;
	}

	@Override
	public void add(MenuComponent menu) {
		System.out.println("This is a leaf, and you can't insert into it!");
	}

	@Override
	public void remove(MenuComponent menu) {
		System.out.println("This is a leaf, and you can't remove from it.");
	}

	@Override
	public void display() {
		System.out.println("-------" + name);
	}

}
