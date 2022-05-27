package com.yedam.java.ch0802;
//부품 관계
//필드로 선언
//필드의 다형성
public class Car {
	Tire frontLeftTire = new KumhoTire();
	Tire frontRighTire = new KumhoTire();
	Tire backLefTire = new KumhoTire();
	Tire backRightTire = new KumhoTire();
	
	void run() {
		frontLeftTire.roll();
		frontRighTire.roll();
		backLefTire.roll();
		backRightTire.roll();
	}
}
