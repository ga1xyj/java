package com.yedam.java.ch0802;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire = new HankookTire(); // 실체클래스 교체 -> 다형성
		myCar.frontRighTire = new HankookTire();
		
		myCar.run();
	}

}
