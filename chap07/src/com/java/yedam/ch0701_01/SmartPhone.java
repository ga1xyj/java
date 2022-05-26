package com.java.yedam.ch0701_01;

import com.java.yedam.ch0701.Phone;

public class SmartPhone extends Phone {

	public SmartPhone(String model, String color) { // Phone 클래스 상속 받으면 super 때문에 반드시 이 형태의 생성자 있어야함
		super(model, color);
	}
	
	//강제 오버라이딩
	//전부 default 상속은 가능하지만 상속할 수 없음 
	@Override
	void powerOff() { // 수정은 안 됨
		System.out.println("휴대폰이 종료됩니다."); // 안내 문구 추가 
		super.powerOff();
	}
 
	@Override // final로 선언한 메소드는 오버라이딩 대상 x 
	public void bell() {
		super.bell();
		System.out.println("벨 소리 : 싸이 - that that!");
	}

	@Override
	void call() {
		super.call();
		System.out.println("안내 문구 : 전화는 용건만 간단히");
	}
	
	private void print() { // private은 오직 자신만 사용 가능 
		System.out.println("ㅇㅇ");
	}
	
	void print() {
		super.bell();
	}
	// 메소드 이름만 알고 있으면 ?
}
