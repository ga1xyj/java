package com.yedam.java.ch0601;

public class Main {

	public static void main(String[] args) { // 동일한 클래스를 통해 인스턴스를 만들었을 때 각 변수가 참조하는 주소는 다르다 
		Car myCar = new Car(); // new 연산자 -> 인스턴스 새롭게 생성, 동일하게 사용하려면 복사해야 함 
		System.out.println(myCar);
		Car yourCar = new Car();
		System.out.println(yourCar);
	}

}
