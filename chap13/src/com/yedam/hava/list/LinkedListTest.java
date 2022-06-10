package com.yedam.hava.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// ArrayList와 LinkedList 속도 비교
public class LinkedListTest {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long start;
		long end;
		
		//System 클래스 nanoTime method 활용
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (end - start) + "ns");
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (end - start) + "ns");
		
		//LinkedList가 5배 정도 빠름
				
	}
}
