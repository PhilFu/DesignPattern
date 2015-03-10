package com.designPattern.abstractFactory;

public class FactoryTest {
	public static void main(String[] args) {
		AbstractFactory factory = new MailFactory();
		Sender mailSender = factory.createSender();
		mailSender.send();
		Receiver mailReceiver = factory.createReceiver();
		mailReceiver.receive();
	}
}
