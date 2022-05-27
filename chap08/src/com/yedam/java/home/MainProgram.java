package com.yedam.java.home;

import java.util.Scanner;

public class MainProgram {
	private Scanner sc = new Scanner(System.in);
	private BookAccess dao = BookRepo.getInstance();
	private BookProgram pro = new BookSystem();
	
	public MainProgram() {
		while(true) {
			pro.menuPrint();
			int menuNum = menuSelect();
			if(menuNum == 1) {
				pro.inputInfo(dao);
			}else if(menuNum == 2) {
				pro.printAllInfo(dao);
			}else if(menuNum == 3) {
				pro.printInfo(dao);
			}else if(menuNum == 4) {
				pro.printRepot(dao);
			}else if(menuNum == 5) {
				exit();
				break;
			}
		}
	}
	
	private int menuSelect() {
		System.out.print("선택> " );
		return sc.nextInt();
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
}
