package com.yedam.hava.set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String data1 = "Java";
		String data2 = new String("Java");
		
		//등호 연산자 사용시 서로 다른 객체로 인식
		if(data1 == data2) {
			System.out.println("서로 같은 객체 입니다.");
		} else {
			System.out.println("서로 다른 객체입니다.");
		}
		
		//String, Wrapper 클래스 모두 동일하게 들어가있음
		//hashcode와 equals 사용해서 내부의 값이 동일함
		Set<String> set = new HashSet<>();
		set.add(data1);
		set.add(data2);
		
		System.out.println("총 객체 수 : " + set.size());
		
		
	}

}
