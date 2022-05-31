package com.yedam.java.ch0902;

public class Anonymous {
	//필드
	//익명 자식 객체 생성
	public Person field = new Person() { //익명 자식 개체
		//필드
		String job = "회사원";
		//메소드
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	}; //한줄이 끝나면 세미콜론
	//생성자
	
	//메소드
	void method1() {
		//로컬변수
		Person var = new Person() { //익명 자식 개체
			//필드
			String job = "취준생";
			//메소드
			void walk() {
				System.out.println("면점 봅니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		var.wake();//부모 클래스만 가지고 있는 wake만 사용 가능
	}
	
	void method2(Person person) {
		person.wake();
	}
}
