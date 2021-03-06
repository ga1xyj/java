package com.yedam.java.ch1501;

public class MethodTest {

	public static void main(String[] args) {
		//BoxA<Integer> intBox = Util.boxing(100);
		//Util.boxing(100);
		BoxA<Integer> intBox1 = Util.boxing(100);
		BoxA<Integer> intBox2 = Util.<Integer>boxing(100);
		
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않습니다.");
		}
		
		//사용되는 타입을 선언할 수 있음
		Util.<String, Integer>printInfo("홍길동");
	}

}
