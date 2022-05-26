package com.yedam.java.ch02;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	//생성자
	
	//메소드
	 // else if가 아닌 if 사용 -> 4개가 동시에 돌아야 함
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0; // if문 벗어날 때 return 값 
		// 어디에서도 펑크
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
	
}
