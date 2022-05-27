package com.yedam.example1;

public class TakeTrans {

	public static void main(String[] args) {
		Student hong = new Student("Hong", 5000); // 객체
		Subway green = new Subway("2호선", 1500); // 객체
		
		hong.take(green); // 돈 빠져나감
		
		hong.showInfo();
		green.showInfo();
		
		
		//Student Choi = new Student("Choi", 10000);
		Bus bus323 = new Bus("323번", 1000);
		
		hong.take(bus323); // 돈 빠져나감
		
		//Choi.showInfo();
		bus323.showInfo();
		hong.showInfo();
		
	}

}
