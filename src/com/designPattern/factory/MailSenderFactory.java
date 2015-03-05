package com.designPattern.factory;

public class MailSenderFactory implements SenderFactory {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
