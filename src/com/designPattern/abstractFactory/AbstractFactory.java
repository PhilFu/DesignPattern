package com.designPattern.abstractFactory;

public interface AbstractFactory {
	public Sender createSender();
	public Receiver createReceiver();
}
