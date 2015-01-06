package com.designPattern.simpleFactory;

public class SendFactory {
	public Sender produce(String sender) {
		if ("mail".equals(sender)) {
			return new MailSender();
		} else if ("sms".equals(sender)) {
			return new SmsSender();
		} else {
			System.out.println("Please check sender type");
			return null;
		}
	}
}
