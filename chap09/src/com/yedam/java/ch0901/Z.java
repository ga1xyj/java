package com.yedam.java.ch0901;

public class Z {
	//인스턴스 필드 -> Z클래스의 인스턴스가 존재
	B field1 = new B(); //Z클래스의 인스턴스가 존재해야함
	C field2 = new C();	//z클래스의 정보만 있으면 됨

	//인스턴스 메소드 
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	//생성자:인스턴스와 연관된 메소드
	
	//정적 필드 초기화 -> Z클래스의 인스턴스가 강제되지 않는다(없을 수 있다)
	static B field3 = new B(); // 반드시 Z클래스의 인스턴스가 필요함
	static C field4 = new C(); // Z클래스의 정보만 필요
	
	//정적 메소드 
	static void method2( ) {
		B var1 = new B(); 
		C var2 = new C();
	}
	
	//인스턴스 멤버 클래스
	class B {}
	//정적 멤버 클래스
	static class C {}
	
}

