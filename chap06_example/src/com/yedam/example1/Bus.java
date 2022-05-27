package com.yedam.example1;

public class Bus {
	private String busNumber;
	private int money;
	private int pay;
	private int passengerCount;
	
	public Bus(String busNumber, int pay) {
		this.busNumber = busNumber;
		this.pay = pay;
	}
	
	//메소드
	public int getPay() {
		return pay;
	}
		
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
