package com.yedam.java.ch0901;

public class ZClassTest {
	
	public static void main(String[] args) {
		//A a = new A();
		//A.C c = new C();
		
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
