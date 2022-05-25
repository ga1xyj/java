package com.java.yedam.ch0701;

public class Computer extends Calculator {
	
	@Override // 자바가 한번 더 확인해줌
	// @:간단한 문구
	double areaCircle(double r) { // 골격은 유지해야 함 // 메소드를 정의할때 실행블록만 건들 수 있음
		System.out.println("Computer 객체");
		//System.out.println("부모 : " + super.areaCircle(r));
		return Math.PI * r * r;
	}
	
	void print() { // 메소드 재정의시 부모, 자식 둘다 생김 우선순위 자식이 더 높음
		super.areaCircle(5);
		areaCircle(5);
	}
}
