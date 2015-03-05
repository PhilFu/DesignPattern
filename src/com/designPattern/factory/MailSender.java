package com.designPattern.factory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is a mail sender.");

	}

}
