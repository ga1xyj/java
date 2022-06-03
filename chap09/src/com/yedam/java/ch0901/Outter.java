package com.yedam.java.ch0901;
//ZClassTest에서 실행
public class Outter {
	String field = "바깥클래스 - 필드";
	void method() {
		System.out.println("바깥클래스 - 메소드");
	}
	void methodA() {
		System.out.println("바깥클래스 - 메소드A"); //Outter 클래스에만 존재하는 메소드
	}
	
	
	//인스턴스 멤버 클래스
	//Outter의 인스턴스 존재
	class Nested{ 
		String field = "중첩클래스 - 필드";
		void method() {
			System.out.println("중첩클래스 - 메소드");
		}
		
		void print() { //this 생략 가능. this는 인스턴스를 가리킴
			methodA();
			System.out.println(this.field); //Nested의 필드
			this.method(); //Nested의 메소드
			System.out.println(Outter.this.field); //어느 클래스의 인스턴스인지 가르켜줌
		}
	}
	//중첩 인터페이스
	//인스턴스 인터페이스
	interface I { 
		int FIELD = 10;
		void method();
	}
	
	static interface N {
		int FIELD = 100;
		void method();
	}
}
