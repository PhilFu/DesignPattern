package com.designPattern.simpleFactory;

public class SenderTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender send = factory.produce("sms");
		send.send();
	}

}
