package baekjoon.p2753;

import java.util.Scanner;
//윤년 계산기
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int result;
		
		result = (year%4==0 && year%100!=0 || year%400==0) ? 1 : 0;
		System.out.printf("%d", result);
	}

}
