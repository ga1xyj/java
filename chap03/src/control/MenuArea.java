package control;
/*
 * 1.사각형 출력 2.삼각형 출력 3.0이면 종료
 */

import java.util.Scanner;

public class MenuArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu;
		
		do { 
			menu = Integer.parseInt(scan.nextLine());
			if (menu == 1) {
				System.out.println("사각형");
			} else if (menu == 2) {
				System.out.println("삼각형");
			} else if (menu == 0) {
				System.out.println("프로그램 종료");
			} else {
				System.out.println("다시 입력하세요");
			}
		} while(menu != 0);
		// 반복 
		// menu 입력
		// 1이면 "사각형" 출력
		// 2이면 "삼각형" 출력
		// 0이면 break
	}

}
