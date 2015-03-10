package com.designPattern.abstractFactory;

public class SmsReceiver implements Receiver {

	@Override
	public void receive() {
		System.out.println("This is sms receiver.");
	}

}
