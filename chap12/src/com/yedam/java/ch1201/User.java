package com.yedam.java.ch1201;

public class User extends Thread{
	private static int serial = 0;
	private Calculator cal;
	private int numInfo;
	
	
	public void setCalculator(Calculator cal) {
		serial+=100;
		this.setName("User" + serial);
		//this 자체가 스레드
		this.cal = cal;
		this.numInfo = serial;
	}
	
	@Override
	public void run() {
		cal.setMemory(100 + serial);
	}
}
