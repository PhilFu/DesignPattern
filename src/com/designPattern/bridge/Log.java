package com.designPattern.bridge;

/**
 * Abstraction
 * 
 * @author DeBen
 *
 */
public abstract class Log {
	private ImpLog implementor;

	public ImpLog getImplementor() {
		return implementor;
	}

	public void setImplementor(ImpLog implementor) {
		this.implementor = implementor;
	}

	public void writeLog(String log) {
		implementor.execute(log);
	}
}
