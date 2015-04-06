package com.designPattern.bridge;

/**
 * concrete implementor
 * 
 * @author DeBen
 *
 */
public class JImpLog extends ImpLog {

	@Override
	public void execute(String msg) {
		System.out.println(msg);
	}

}
