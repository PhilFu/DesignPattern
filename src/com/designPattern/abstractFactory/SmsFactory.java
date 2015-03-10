package com.designPattern.abstractFactory;

public class SmsFactory implements AbstractFactory {

	@Override
	public Sender createSender() {
		return new SmsSender();
	}

	@Override
	public Receiver createReceiver() {
		return new SmsReceiver();
	}

}
