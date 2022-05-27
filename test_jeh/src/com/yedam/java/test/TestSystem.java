package com.yedam.java.test;

import java.util.Scanner;

public class TestSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		StudentSystem system = new StudentSystem();
		int size = 0;
		
		while (run) {
			System.out.println("=== 1.학생수 입력 2. 학생정보 등록 3.학생정보 전체조회 4. 학생정보 분석 5. 종료 ===");
			System.out.println("선택 >");
			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				System.out.println("학생 수> ");
				size = sc.nextInt();
				system.setListSize(size);
			}
			if (selectNo == 2) {
				for(int i=0; i<size; i++) {
				System.out.println("학번 >");
				int studentId = sc.nextInt();
				System.out.println("이름 >");
				String name = sc.next();
				System.out.println("점수 >");
				int score = sc.nextInt();
				system.putStudentList(studentId, name, score);
				}
			}
			if (selectNo == 3) {
				system.printStudentList();
			}
			if (selectNo == 4) {
				system.printInfo();
			}
			if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
