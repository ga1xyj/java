package com.yedam.java.ch1201;

public class UserTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		//추가
		cal.setMemory(100);
		
		User user1 = new User();
		user1.setCalculator(cal);
		user1.start();
		//메모리값:200으로 나와야 하는데 -> 300 출력
		//해당되는 스레드는 멈추지만 객체는 사용됨(스레드와 객체는 별개)
		//Calculator 클래스에서 동일한 스레드에서 접근 -> 문제
		
		//새로운 Calculator 인스턴스 만들면 해결됨
		User user2 = new User();
		user2.setCalculator(cal);
		user2.start();
		//메모리값:300
		//멈추는 순간 user2가 나타나면서 값을 메모리 값을 300으로 바꿈
		//멀티스레드에서는 다른 스레드가 건들 수 있는 상황이 문제됨
		


	}

}
