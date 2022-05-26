package control;

import java.util.Scanner;

public class P161 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.print("선택> ");
			int num = scanner.nextInt();
			if (num == 1) {
				System.out.println("예금액>10000");
				balance += 10000;
			} else if (num == 2) {
				System.out.println("출금액>2000");
				balance -= 2000;
			} else if (num == 3) {
				System.out.println("잔고>"+balance);
			} else {
				System.out.println("\n프로그램 종료");
				break;
			}
				
		}
	}

}
