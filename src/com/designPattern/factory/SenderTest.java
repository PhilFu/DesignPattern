package com.designPattern.factory;

public class SenderTest {

	public static void main(String[] args) {
		SenderFactory smsFactory = new SmsSenderFactory();
		Sender sms = smsFactory.produce();
		sms.send();
		
		SenderFactory mailFactory = new MailSenderFactory();
		Sender mail = mailFactory.produce();
		mail.send();
	}

}
