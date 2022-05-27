package control;

import java.util.Scanner;

public class ControlMain {
	// 성적 계산기
	public static void main(String[] args) {
		
		// 등급 계산 조건문
		Scanner scan = new Scanner(System.in);
		int score;		// 점수 입력
		String grade;	// 등급 입력
		
		// 조건이 맞을 동안 계속 실행
		do {
			// 점수 키보드로부터 입력
			score = Integer.parseInt(scan.nextLine());
			if (score == 0) {
				break; // 반복문을 빠져나감
			}
			// 등급 계산 조건문
			if(score >= 90) {
				grade = "A등급";
			} else if(score >= 80) {
				grade = "B등급";
			} else if(score >= 70) {
				grade = "C등급";
			} else {
				grade = "D등급";
			}
			// 등급 결과 출력
			System.out.printf("%d성적은 %s입니다.\n", score, grade);
			} while(score != 0);
		System.out.println("프로그램 종료");
	}

}
