package com.yedam.hava.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add(new String("Java"));
		//새로운 값 new 연산자 -> String 클래스는 동일한 데이터는 서로 공유함
		set.add("iBATIS");
		
		System.out.println("총 객체 수 : " + set.size());
		//중복된 Java 제거돼서 4개
		System.out.println();
		
		//반복자
		Iterator<String> iterator = set.iterator();
		//while문 사용 - 값 확인
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		//입력한 순서와 항상 일치하지 않음(iterator가 가져오는 순서)
		set.remove("JDBC");
		set.remove("iBATIS");
		
		for(String data : set) {
			System.out.println(data);
		}
		
		System.out.println();
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음.");
		}
	}
}
