package com.designPattern.flyweight;

/**
 * The flyweight class
 * 
 * @author DeBen
 *
 */
public abstract class WebSite {
	public String type;

	public WebSite(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract void use(User user);
}
