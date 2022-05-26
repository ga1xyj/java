package memory;

public class ArrayTest {

	public static void main(String[] args) {

		int[] month = new int[] {31,28,31,30,31,31}; // 배열 변수를 선언과 동시에 초기화
		//2월달의 마지막 날은?
		System.out.println(month[1]);
		
		int[] week = {'월', '화', '수'}; // 값의 개수만큼 배열 크기 정해짐 
		
		int[] score = new int[10]; // 배열 변수 선언
		//score = {4,6,10,3,5}; // 배열 변수 초기화 -> error 
		score = new int[] {46,10,3,5};
		score[0] = 100;
		score[1] = 2;
		score[2] = 5;
		score[3] = 6;
		
	}

}
