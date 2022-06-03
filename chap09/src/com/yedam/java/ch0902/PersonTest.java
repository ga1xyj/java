package com.yedam.java.ch0902;

public class PersonTest {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();

		// 1.필드 - 익명 자식 객체
		anony.field.wake();
		// 2.로컬변수 - 익명 자식 객체
		anony.method1();
		// 3.매개변수 - 익명 자식 객체
		anony.method2(new Person() {
			// 필드
			String job = "학생";

			// 메소드
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});

	}

}
