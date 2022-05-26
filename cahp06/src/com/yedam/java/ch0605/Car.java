package com.yedam.java.ch0605;

public class Car {
	// 필드
	public String model;
	public int speed;
	
	// 정적 필드 - 생산 수량
	public static int count;

	// 생성자
	public Car(String model) {
		this.model = model;
		Car.count++; // this 쓰면 가능은한데 헷갈림 정적멤버는 클래스명으로
	}

	// 메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void run() {
		for(int i=10; i<=50; i+=10) { //10씩 커진다
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속:");
			System.out.println(this.speed + "km/h");
		}
	}
}
