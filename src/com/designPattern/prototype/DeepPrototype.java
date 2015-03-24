package com.designPattern.prototype;

public class DeepPrototype implements Cloneable {

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
		DeepPrototype pro = null;
		try {
			pro = (DeepPrototype) super.clone();
			pro.prototype = (Prototype) this.prototype.clone();
			return pro;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		Prototype p = new Prototype();
		p.setName("Original object");

		DeepPrototype newObj = new DeepPrototype();
		newObj.setId("Test 1");
		newObj.setPrototype(p);

		DeepPrototype copyObj = (DeepPrototype) newObj.clone();
		copyObj.setId("Test 2");
		copyObj.getPrototype().setName("Changed object");

		System.out.println("Original id: " + newObj.getId());
		System.out.println("Original name: " + newObj.getPrototype().getName());

		System.out.println("Changed id: " + copyObj.getId());
		System.out.println("Changed name: " + copyObj.getPrototype().getName());
	}

}
