package com.yedam.java.ch0802;

public class DriverTest {
//매개변수의 다형성 -> 인터페이스-구현클래스 사이의 자동타입변환 
//하나의 매개변수로 처리
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		driver.drive(taxi);
		driver.drive(bus);
	}

}
