package baekjoon.p2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i=0; i < num; i++) { // 전체 반복
			
			for (int j=i+1; j < num; j++) {
				System.out.println(" ");
			}
			
			for (int k=num-i; k <= num; k++) { //
				System.out.print("*");
			}
			 System.out.println();
		}
	}
}
