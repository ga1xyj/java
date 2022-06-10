package com.yedam.java.ch1601;

@FunctionalInterface
public interface MyFunctionalInterface {
//반드시 하나의 메소드만 포함해야 함
	//미리 람다식인터페이스 정의
	public void method();
	//public void method2(); 추가시 문제
}
