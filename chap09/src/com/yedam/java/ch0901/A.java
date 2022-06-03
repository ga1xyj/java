package com.yedam.java.ch0901;

public class A {
	//생성자
	A() {
		System.out.println("A 인스턴스가 생성됨.");
	}
	//1.인스턴스 멤버 클래스
	class B {
		//필드
		int field1;
		//static int field2; //정적 필드 생성 불가능 
		//생성자
		B() {}
		//메소드
		void method1() {
			System.out.println("B 인스턴스가 생성됨.");}
	}
	
	//2.정적 멤버 클래스
	static class C {
		//필드
		int field1;
		static int field2;
		//생성자
		C() {
			System.out.println("C 인스턴스가 생성됨.");
		}
		//메소드
		void method1() {}
		static void method2() {}
		//둘 다 자신의 인스턴스를 만들고나서 접근 가능 정적 멤버 클래스는 정적 필드와 정적 메소드 가능

		//3.로컬 클래스 
		}
	
	void method() {
		class D {
			//필드
			int field1;
			//생성자
			D() {
				System.out.println("D 인스턴스가 생성됨.");
			}
			//메소드
			void method1() {}
		}
		//바로 사용하는 코드 넣어야 함
		D d = new D();
		d.field1 = 1;
		d.method1();
	}
}
