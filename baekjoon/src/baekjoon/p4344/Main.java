package baekjoon.p4344;

import java.util.Scanner;

public class Main {
//평균은 넘겠지
//case 입력
//case 만큼 배열 생성
//다시 학생 입력
//학생 수 만큼 배열 생성
//평균 게산
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr;// 배열 선언
		int testcase = scan.nextInt(); // case 수 입력
		
		for(int i = 0; i < testcase; i++) {
			int student = scan.nextInt(); //학생 수 입력
			arr = new int[student]; // 학생 수 만큼 배열 크기 지정
			
			double sum = 0;
			
			for(int j = 0; j < student; j++) {
				int score = scan.nextInt(); // 성적 입력
				arr[j] = score; // 학생 점수 배열 완성
				sum += score; 
			}
			
			double avg = sum/student;
			double count = 0;
			
			for(int j = 0; j < student; j++) {
				if(arr[j]>avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",count/student*100);
			
		}
			
		
	}
}