package com.yedam.java.ch0902;

public class RemoteControlTest {

	public static void main(String[] args) {
		Product product = new Product();
		
		//1.필드 - 익명 구현 객체
		product.field.turnOn();
		product.field.turnOff();
		System.out.println();
		//2.로컬변수 - 익명 구현 객체
		product.method1(); //로컬변수는 메소드 안에 있어서 메소드만 호출
		System.out.println();
		//3.매개변수 - 익명 구현 객체
		product.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("노트북을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("노트북을 끕니다.");
			}
			
		});
	}

}
