package com.yedam.java.ch02;

public class ChildTest {

	public static void main(String[] args) {
		Father father = new Father();
		Uncle uncle = new Uncle();
		Child child = new Child();
		Cousin cousin = new Cousin();
		
		GranPa pa = father; // father에 담아짐
		// 타입이 다른 인스턴스 담아도 문제 X
		// 타입은 상속관계에 있을때 자식을 다 담을 수 있다 호출시 자식 메소드 호출
		pa.method();
		pa = uncle;
		pa.method();
		pa = child;
		pa.method();
		pa = cousin;
		pa.method();
		
		
		Father fa = child; // 타입 변환 일어남 (Father-Child 상속 관계)
		//fa = uncle; // uncle에 안 담아짐
		//fa = cousin; // 타입 변환 일어나지 않음
		fa.method(); // child 메소드 실행 
		
		System.out.println();
		Uncle un = cousin; // 상속 관계인 cousin만 타입 변환
		//un = father; // 강제 타입도 불가능
		//un = child;
		un.method(); // Cousin 메소드 실행
	
		Child ch = (Child)fa; // 강제 타입 변환 가능
		//Cousin co = (Cousin)fa;
		// 타입 변환:관계가 있는 것들 사이에서만
	}

}
