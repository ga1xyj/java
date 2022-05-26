package com.yedam.java.ch02;

public class HanKookTire extends Tire {

	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 출력에서 Tire->KumhoTire로 변경
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HanKookTire 수명 : " +(maxRotation - accumulatedRotation) +"회");
		return true;
		} else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
