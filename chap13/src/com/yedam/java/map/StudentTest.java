package com.yedam.java.map;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		
		//변수 이용
		Student s = new Student(1, "홍길동");
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		
		//map.put(new Student(1, "홍길동"), 95);
		//map.put(new Student(1, "홍길동"), 100);
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("학번 : 1, 이름 : 홍길동, 성적 : " + map.get(new Student(1, "홍길동")));
		//세개의 다른 객체로 인식
	}

}
