package com.designPattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Deep clone, use serialization to write object into pipe, and then read out
 * with deserialization, the object in pipe is an copy of original object, read
 * out it and recreate it.
 * 
 * @author DeBen
 *
 */
public class DeepPrototypeSe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private PrototypeSe prototype;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PrototypeSe getPrototype() {
		return prototype;
	}

	public void setPrototype(PrototypeSe prototype) {
		this.prototype = prototype;
	}

	@Override
	public Object clone() {
		try {
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			ObjectOutputStream oo = new ObjectOutputStream(bo);
			oo.writeObject(this);

			ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
			ObjectInputStream oi = new ObjectInputStream(bi);
			return oi.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		PrototypeSe pro = new PrototypeSe();
		pro.setName("Original Object");

		DeepPrototypeSe newObj = new DeepPrototypeSe();
		newObj.setId("Test 1");
		newObj.setPrototype(pro);

		DeepPrototypeSe copyObj = (DeepPrototypeSe) newObj.clone();
		copyObj.setId("Test 2");
		copyObj.getPrototype().setName("Changed Object");

		System.out.println("Original id: " + newObj.getId());
		System.out.println("Original name: " + newObj.getPrototype().getName());

		System.out.println("Changed id: " + copyObj.getId());
		System.out.println("Changed name: " + copyObj.getPrototype().getName());
	}
}
