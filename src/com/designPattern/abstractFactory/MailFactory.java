package com.designPattern.abstractFactory;

public class MailFactory implements AbstractFactory {

	@Override
	public Sender createSender() {
		return new MailSender();
	}

	@Override
	public Receiver createReceiver() {
		return new MailReceiver();
	}

}
