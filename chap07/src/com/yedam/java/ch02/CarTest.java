package com.yedam.java.ch02;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); // 문제가 생기는 위치 알려줌(어느 타이어인지)
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 Tire 교체");
				car.frontLeftTire = new HanKookTire("앞왼쪽", 15); // Tire->HanKookTire
				break;
			case 2:
				System.out.println("앞오른쪽 Tire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 14); // Tire->KumhoTire
				break;
			case 3:
				System.out.println("뒤왼쪽 Tire 교체");
				car.backLeftTire =  new Tire("뒤왼쪽", 13);
				break;
			case 4:
				System.out.println("뒤오른쪽 Tire 교체");
				car.backRightTire = new Tire("뒤오른쪽", 12);
				break;
			}
			System.out.println();
		}
	}

}
