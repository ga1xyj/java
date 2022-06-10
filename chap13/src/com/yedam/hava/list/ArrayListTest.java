package com.yedam.hava.list;

import java.util.ArrayList;
import java.util.List;
//import 필수

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//List(인터페이스)<타입> 리스트명 = newArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		//인덱스 지정
		list.add("iBATIS");
		//순차적으로 삽입됨
		
		//배열 크기 확인 메소드(return int 타입)
		System.out.println("총 객체 수 : "+list.size());
		System.out.println();
		String skill = list.get(2); //2번째 인덱스값 가져오기
		System.out.println("[2] : " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ":"+list.get(i));
			//get 메소드 i변수 이용해서 출력
			//Database 제외하고 순차적 삽입됨
		}
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		System.out.println();
		//향상된 for문
		for(String data : list) {
			System.out.println(data);
		}
	}
}
