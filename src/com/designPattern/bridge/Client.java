package com.designPattern.bridge;

public class Client {

	public static void main(String[] args) {
		Log dbLog = new DatabaseLog();
		dbLog.setImplementor(new JImpLog());
		dbLog.writeLog("Database log in Java platform");

		Log dbLog2 = new DatabaseLog();
		dbLog2.setImplementor(new NImpLog());
		dbLog2.writeLog("Database log in .net platform");

		Log textLog = new TextLog();
		textLog.setImplementor(new NImpLog());
		textLog.writeLog("Text log in .net platform");

		Log textLog2 = new TextLog();
		textLog2.setImplementor(new JImpLog());
		textLog2.writeLog("Text log in Java platform");
	}

}
