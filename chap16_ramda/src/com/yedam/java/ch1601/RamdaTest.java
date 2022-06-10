package com.yedam.java.ch1601;

public class RamdaTest {
	public static void main(String[] args) {
		//메소드의 시그니처에 따라 다른 람다의 표현식
		
		//1.매개변수 X, 리턴타입 X 람다식
		MyFunInterfaceA fa = () -> {
		String str = "method call1";
		System.out.println(str);
		};
		fa.method();
		
		fa = () -> {System.out.println("method call2");};
		fa.method();
		//한 줄 실행할때
		fa = () -> System.out.println("method call3");
		fa.method();
		
		//2.매개변수 O, 리턴타입 X 람다식
		MyFunInterfaceB fb = (int x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fb.method(5);
		//int 타입에 맞춰서 연산
		fb = (x) -> {System.out.println(x * 5);};
		fb.method(0);
		
		//매개변수 하나, 실행블록도 하나
		fb = x -> System.out.println(x * 5);
		fb.method(10);
		
		//3.매개변수 O, 리턴타입 O 람다식
		MyFunInterfaceC fc = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fc.method(1, 2));
		
		fc = (x, y) -> {return x + y ;};
		//return 구문에 표현식
		System.out.println(fc.method(1, 5));
		
		fc = (x, y) -> x + y;
		//return과 실행블록 모두 생략하고 표현식만 작성
		System.out.println(fc.method(6, 5));
		
		//함수로 넘기는 방식
		fc = (x, y) -> {
			int result = Math.max(x, y);
			return result;
		};
		//코드 생략 : return 구문만 남기기
		fc = (x, y) -> Math.max(x, y);
		System.out.println(fc.method(10, 12));
		
		int val1 = 10;
		int val2 = 20;
		//익명 구현 객체에서 외부(로컬) 변수 사용시 final 속성 가짐
		fa = () -> {
			int result = val1 + val2;
			System.out.println(result);
		};
		//필드와 연결되어있는 상태가 아니라 내부에 있는 값만 가져옴
		fa.method();
		
		//val1 = 100;
		//선언시 fa 실행 블록 오류남
		
	}

}
