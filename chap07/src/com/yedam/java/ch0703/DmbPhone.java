package com.yedam.java.ch0703;

public class DmbPhone extends Phone { //추상메소드 추가->오류

	public DmbPhone(String model, String color) {
		super(model, color);
	}

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("부팅이 완료되었습니다.");
	}
	
	public void showDmb() { // DmbPhone 고유의 기능 
		System.out.println("DMB를 실행합니다.");
	}

	@Override //추상메소드 재정의해야 오류 사라짐(강제성)
	public void bell() {
		System.out.println("벨이 울립니다.");
		System.out.println("벨소리~~~");
		System.out.println("벨!!");
	}
		
}
