package com.yedam.java.ch0605;

public class Singleton {
	// 필드
	private static Singleton singleton = new Singleton(); // static이 없으면 사용 불기 + private 
	
	// 생성자
	private Singleton() {} // default 생성자 + private
	
	// 메소드
	static Singleton getInstance() {
		return singleton;
	}
}
