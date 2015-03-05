package com.designPattern.factory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is a sms sender.");
	}

}
