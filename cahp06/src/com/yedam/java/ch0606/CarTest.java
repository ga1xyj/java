package com.yedam.java.ch0606;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car(); // 필드명으로 불가능해서 인스턴스 사용
		myCar.setSpeed(-50); // if 조건문에서 0으로 처리해줌
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		myCar.setSpeed(50);
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		myCar.setSpeed(50);
		if(!myCar.isStop()) { //boolean type 초기화하지 않아서 faulse인데 !faulse라서 true
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : "+myCar.getSpeed());
		//0이 나오는 이유 -> this.speed = 0;
	} 

}
