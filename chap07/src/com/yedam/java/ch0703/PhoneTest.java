package com.yedam.java.ch0703;

public class PhoneTest {

	public static void main(String[] args) {
		/*
		Phone phone = new Phone("Z플립", "블랙");
		phone.powerOn();
		*/ //Phone 클래스가 absract일때 오류
		
		DmbPhone dmbPhone = new DmbPhone("Z플립", "블랙");
		dmbPhone.powerOn();
		dmbPhone.showDmb();
	}

}
