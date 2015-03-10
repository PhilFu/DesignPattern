package com.designPattern.abstractFactory;

public class MailReceiver implements Receiver {

	@Override
	public void receive() {
		System.out.println("This is a mail receiver.");
	}

}
