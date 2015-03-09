package com.designPattern.staticFactory;

public class SendFactory {
	public static Sender produceSmsSender(){
		return new SmsSender();
	}
	
	public static Sender produceMailSender(){
		return new MailSender();
	}
}
