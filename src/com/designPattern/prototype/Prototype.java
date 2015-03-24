package com.designPattern.prototype;


/**
 * 
 * @author DeBen
 *
 */
public class Prototype implements Cloneable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * light clone
	 */
	@Override
	public Object clone() {
		Prototype proto;
		try {
			proto = (Prototype) super.clone();
			return proto;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		Prototype pro = new Prototype();
		pro.setName("Original name");

		Prototype pro1 = (Prototype) pro.clone();
		pro1.setName("Changed name");

		System.out.println("Original name: " + pro.getName());
		System.out.println("Changed name: " + pro1.getName());
	}

}
