package com.yedam.java.ch0605;

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton();
		Singleton obj1 = Singleton.getInstance(); // 정적 메소드 호출
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) { // 비교시 동일한 인스턴스, 즉 인스턴스 주소를 가르쳐줌
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 singleton 객체입니다.");
		}
	}

}
