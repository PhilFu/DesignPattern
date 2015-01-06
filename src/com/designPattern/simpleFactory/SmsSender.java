package com.designPattern.simpleFactory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is a sms sender");
	}

}
