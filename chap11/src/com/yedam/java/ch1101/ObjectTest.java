package com.yedam.java.ch1101;

import java.util.Date;

public class ObjectTest {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		if(obj1.equals(obj2)) {
			System.out.println("ob1과 obj2가 논리적으로 동등합니다.");
		}
		
		if(obj1 == obj2) {
			System.out.println("ob1과 obj2가 논리적으로 동등합니다.");
		}
		
		//내부 필드값 동일한 변수는?
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		
		if(m1.equals(m2)) {
			System.out.println("m1과 m2는 동등합니다.");
		} else {
			if(obj1.equals(obj2)) {
				System.out.println("m1과 m2가 동등하지 않습니다.");
			}
		}
		
		if(m1.equals(m3)) {
			System.out.println("m1과 m3는 동등합니다.");
		} else {
			if(obj1.equals(obj2)) {
				System.out.println("m1과 m3가 동등하지 않습니다.");
			}
		}
		
		Date date = new Date(); // java.sql 패키지인지 java.util 패키지인지?
		System.out.println(date);
	}

}
