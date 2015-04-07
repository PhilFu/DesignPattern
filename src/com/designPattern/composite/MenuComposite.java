package com.designPattern.composite;

import java.util.ArrayList;

public class MenuComposite extends MenuComponent {

	public MenuComposite(String name) {
		items = new ArrayList<>();
		this.name = name;
	}

	@Override
	public void add(MenuComponent menu) {
		items.add(menu);
	}

	@Override
	public void remove(MenuComponent menu) {
		if (items.contains(menu)) {
			items.remove(menu);
		}
	}

	@Override
	public void display() {
		System.out.println(name);
		for (MenuComponent menuComponent : items) {
			menuComponent.display();
		}
	}

}
