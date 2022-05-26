package com.yedam.java.ch0703;

public abstract class Animal {
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상메소드는 추상 클래스 필수
}
