package com.yedam.java.ch02;

public class ChildTest2 {

	public static void main(String[] args) {
		GranPa pa = new Father(); // 오버라이드된 Father 참조하여 GranPa 타입 인스턴스 pa 생성(자동형변환)
		pa.method();
		
		pa = new Uncle(); // 오버라이드된 Uncle 참조 - 값변경
		
		///instance of 연산자 사용
		System.out.println();
		if(pa instanceof Father) { //Uncle인지 Father인지 확인
			Father fa = (Father) pa; // GranPa를 Father로 강제형변환
			fa.method(); // GranPa와 공통 메소드
			fa.method2(); // Father 고유 메소드
		} else {
			System.out.println("pa 변수가 가지고 있는 인스턴스는 Father이 아닙니다.");
		}
		
		//강제형변환
		Father fa = (Father) pa; //Father의 고유 메소드 원함 -> 강제형변환 
		fa.method();
		fa.method2();
		//??타입이 다르면 자식 인스턴스만 호출 -> 결과 같다 오버라이드때문
		//참조타입인 클래스는 인스턴스에 손상 x
	}

}
