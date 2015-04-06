package com.designPattern.bridge;

/**
 * refined abstraction
 * 
 * @author DeBen
 *
 */
public class DatabaseLog extends Log {
	@Override
	public void writeLog(String msg) {
		getImplementor().execute(msg);
	}
}
