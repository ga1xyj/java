package com.yedam.java.emp;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			printMenu();
			int selectNum = sc.nextInt();
			if(selectNum == 1) {
				
			}if(selectNum == 2) {
				
			}if(selectNum == 3) {
				
			}if(selectNum == 4) {
				
			}if(selectNum == 5) {
				
			}
			
		}
	}
	
	public static void printMenu() {
		System.out.println("***********************************");
		System.out.println("1.전체조회|2.단건조회|3.등록|4.수정|5.삭제");
		System.out.println("***********************************");
	}
	

}
