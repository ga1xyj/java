package com.yedam.java.ch02;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) { // 동일한 타입 생성자
		super(location, maxRotation);
	}
	
	// 출력에서 Tire->KumhoTire로 변경
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " +(maxRotation - accumulatedRotation) +"회");
		return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***"); 
			return false;
		}
	}

}
