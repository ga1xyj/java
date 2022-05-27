package ccom.yedam.java.ch0604_01;

import java.util.Scanner;

public class TestCal {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		while(run) {
			System.out.println("1.개수입력 | 2.숫자입력 | 3. 더하기 | 4. 빼기 | 5. 곱하기 | 6. 나누기 | 7. 프로그램 종료");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("입력> ");
				int size = sc.nextInt();
				calculator.setArraySize(size);
			}else if(selectNo == 2) {
				System.out.print("입력> ");
				int num = sc.nextInt();
				calculator.setNum(num);
			}else if(selectNo == 3) {
				calculator.plus();
			}else if(selectNo == 4) {
				calculator.minus();
			}else if(selectNo == 5) {
				calculator.multiplication();
			}else if(selectNo == 6) {
				calculator.division();
			}else if(selectNo == 7) {
				run = false;
				System.out.println("프로그램종료");
			}
		
		}
		
	}

}
