package com.designPattern.Facade;

public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

	public void startup() {
		System.out.println("Startup the computer");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("Computer start finished.");
	}

	public void shutdown() {
		System.out.println("Shutdown the computer");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("Computer shutdown finished.");
	}
}
