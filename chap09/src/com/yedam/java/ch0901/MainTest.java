package com.yedam.java.ch0901;

public class MainTest {

	public static void main(String[] args) {
		//1. 인스턴스 클래스
		A a = new A();
		A.B b = a.new B(); //인스턴스 멤버 클래스 선언 방법
		//A라는 이름으로 접근 x A라는 이름으로 만들어진 인스턴스를 이용해서 내부에 접근
		b.field1=1;
		b.method1();
		
		
		//2.정적 멤버 클래스
		A.C c = new A.C(); //A클래스 인스턴스 생성할 필요 x, C인스턴스 단독으로 생성
		A.C.field2 =2; //C클래스에 대해서 인스턴스를 선언하지 않아도 정적 필드에 접근하는 것은 문제 x
		c.field1 = 1;
		c.method1();
		
		//3.로컬 클래스
		a.method(); //메소드 내에 선언되어 있어서 메소드로 호출 
	}

}
