package com.yedam.java.ch02;

public class Father extends GranPa { //클래스 상속
	@Override
	void method() { 
		System.out.println("Father 메소드");
	}
	
	void method2() {
		System.out.println("Father 고유 메소드");
	}
 }
