package com.yedam.java.ch0605;

public class PlanetTest {

	public static void main(String[] args) {
		System.out.println("pi : " + Planet.pi); //상수는 출력 가능
		//Planet.pi = Math.pi; //수정 불가
		
		Planet earth = new Planet(6400);
		System.out.println("earth : " + earth.radius); // 인스턴스로 접근
		//earth.radius = 6000; // 인스턴스를 통해서는 가능   
		Planet moon = new Planet(1500);
		System.out.println("moon : " + moon.radius);
		
	}

}
