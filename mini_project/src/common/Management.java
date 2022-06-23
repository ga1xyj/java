package common;

import java.util.Scanner;

import board.NoticeManagement;

public class Management {
	protected Scanner sc = new Scanner(System.in);
	
	public void run() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();
			if (menuNo == 1) {
				new NoticeManagement();
			} else if (menuNo == 2) {

			} else if (menuNo == 3) {

			} else if (menuNo == 4) {

			} else if (menuNo == 5) {
				exit();
				break;
			} else {
				showInputError();
			}
		}
	}

	protected void menuPrint() {
		System.out.println("==========================================");
		System.out.println(" 1.공지사항 2.자유게시판 3.학과게시판 4.장터게시판 ");
		System.out.println("==========================================");
	}

	protected int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주시기 바랍니다.");
		}
		return menuNo;
	}

	protected void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	protected void showInputError() {
		System.out.println("메뉴에서 입력해주시기 바랍니다.");
	}

}
