package com.yedam.java.ch0605;

public class Planet {
	//필드
	final int radius;
	static final double pi = 3.1459; // 상수
	//static이 없고 final만 붙으면 임의의 값 다르게 가능
	//static이 없으면 각 인스턴스별로 관리
	
	//생성자
	Planet(int radius) {
		this.radius = radius;
	}
	
	//메소드
	void getArea() {
		double result = 4 * Planet.pi * this.radius * this.radius;
		System.out.println("행성의 표면적 : " + result);
	}
}
