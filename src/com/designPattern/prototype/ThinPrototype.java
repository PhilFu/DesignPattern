package com.designPattern.prototype;

public class ThinPrototype implements Cloneable {

	private String id;
	private Prototype prototype;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Prototype getPrototype() {
		return prototype;
	}

	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		Prototype pro = new Prototype();
		pro.setName("Original prototype");

		ThinPrototype newObj = new ThinPrototype();
		newObj.setId("Test 1");
		newObj.setPrototype(pro);

		ThinPrototype copyObj = (ThinPrototype) newObj.clone();
		copyObj.setId("Test 2");
		copyObj.getPrototype().setName("Changed prototype");

		System.out.println("Original id: " + newObj.getId());
		System.out.println("Original name: " + newObj.getPrototype().getName());

		System.out.println("Changed id: " + copyObj.getId());
		System.out.println("Changed name: " + copyObj.getPrototype().getName());
	}
}
