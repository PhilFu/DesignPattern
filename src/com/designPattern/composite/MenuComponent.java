package com.designPattern.composite;

import java.util.List;

public abstract class MenuComponent {

	public String name;

	public List<MenuComponent> items;

	public abstract void add(MenuComponent menu);

	public abstract void remove(MenuComponent menu);

	public abstract void display();
}
