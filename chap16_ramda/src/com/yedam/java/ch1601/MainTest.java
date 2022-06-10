package com.yedam.java.ch1601;

public class MainTest {

	public static void main(String[] args) {
		MyFunctionalInterface fi = () -> {System.out.println("람다식 실행");};
		//fi를 통해 메소드 호출
		fi.method();
		//void, return 타입 x 형태 
		
		//fi라는 변수 = 메소드 하나를 가진 인스턴스
		//람다식:메소드에 대해 새롭게 정의
		//메소드와 실행식 매칭됨 -> 인스턴스 생성
		//객체지향 프로그래밍에 함수 프로그래밍 적용됨
		//필드 사용 불가
		
		//익명 구현 객체
		//코드 간소화 -> 람다식
		MyFunctionalInterface mfi = new MyFunctionalInterface() {
			@Override
			public void method() {
				System.out.println("익명 구현 객체 실행");
			}
		};
		mfi.method();
	}

}
