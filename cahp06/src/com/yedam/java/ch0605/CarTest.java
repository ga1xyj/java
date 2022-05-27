package com.yedam.java.ch0605;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐"); // 기본 생성자가 String 을 매개변수로 가짐
		Car yourCar = new Car("벤츠"); // 정적 메소드만 사용하는 것이 원칙이나 new 연산자 사용
		//ct.print();
		print();
		
		myCar.run();
		System.out.println(yourCar.speed);
		yourCar.run();
		System.out.println(myCar.speed);
	}

	public static void print() {
		System.out.println("이것은 메소드입니다.");
	}
}
