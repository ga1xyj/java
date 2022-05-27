package com.yedam.java.ch0602;

public class Car {

		String company = "현대자동차";
		String model = "그랜저";
		String color = "검정";
		int maxSpeed = 350;
		int speed;
		
		//Car() {} //기본 생성자 자바가 대신 만들어줌(조건:클래스 내에 어떤 생성자도 없어야 함)
		// 기본 생성자는 항상 만들어줘야 한다.
		
		/*Car(String model) { // 매개 변수의 타입과 순서가 달라야 오버로딩이 성리보딤
			this.model = model;
		}*/
		
		Car(String color) { // 생성자
			//this.color = color;
			//this.company = "기아"; // 인스턴스가 존재하지않는데 필드 초기화 하겠다고 함
			this("그랜저", color, 350); // 인스턴스 생성
			company = "기아";
			//this.company = "기아";
		}
		
		
		Car(String color, String model) { // 생성자
			//this.model = model; //this:클래스 내부에서 사용할 수 있는 연산자 -> 인스턴스(의 필드)를 가리킴, 인스턴스의 값을 바꾸겠다
			//this.color = color;
			this(model,color,350); //중복되는 부분 줄이기 동일한 형태 생성자 불러옴
		}
	
		// 생성자
		Car(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
}
