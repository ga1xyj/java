package com.yedam.java.ch0602;
//클래스, 필드와 인스턴스
public class Main {

	public static void main(String[] args) {
		Car myCar= new Car();//인스턴스 생성
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.err.println(myCar.maxSpeed);
		myCar.speed = 100; //각 인스턴스는 독립됨 다른 인스턴스에는 영향 x
		System.out.println(myCar.speed);
		
		Car yourCar = new Car();
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		System.out.println(yourCar.speed);
		
		Car blueCar = new Car("Blue");
		System.out.println(blueCar.color);
		
		Car newCar = new Car();
		System.out.println(newCar.color);
	
	}

}
