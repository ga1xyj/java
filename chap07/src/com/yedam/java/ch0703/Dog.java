package com.yedam.java.ch0703;

public class Dog extends Animal { //오버라이드 안하면 오류생김

	@Override //추상메소드 오버라이드해야함
	public void sound() {
		System.out.println("멍멍");
	}

}
