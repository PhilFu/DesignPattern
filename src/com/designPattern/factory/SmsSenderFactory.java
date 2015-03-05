package com.designPattern.factory;

public class SmsSenderFactory implements SenderFactory {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
