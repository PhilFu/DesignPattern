package com.designPattern.composite;

public class Client {

	public static void main(String[] args) {
		MenuComposite subMenu1 = new MenuComposite("SubMenu1");
		MenuComposite subMenu2 = new MenuComposite("SubMenu2");
		MenuComposite subMenu3 = new MenuComposite("SubMenu3");
		MenuComposite subMenu4 = new MenuComposite("SubMenu4");
		MenuComposite subMenu5 = new MenuComposite("SubMenu5");

		ItemLeaf leaf1 = new ItemLeaf("Leaf1");
		ItemLeaf leaf2 = new ItemLeaf("Leaf2");

		subMenu1.add(leaf1);
		subMenu1.add(leaf2);

		MenuComposite menuComposite = new MenuComposite("Menu");
		menuComposite.add(subMenu1);
		menuComposite.add(subMenu2);
		menuComposite.add(subMenu3);
		menuComposite.add(subMenu4);
		menuComposite.add(subMenu5);

		ItemLeaf leaf3 = new ItemLeaf("Leaf3");
		subMenu3.add(leaf3);

		menuComposite.display();
	}

}
