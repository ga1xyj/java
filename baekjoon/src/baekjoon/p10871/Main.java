package baekjoon.p10871;

import java.util.Scanner;

public class Main {

	// X보다 작은 수
	public static void main(String[] args) {
		//method1();
		method2();
	}
	
	public static void method2() {
		Scanner scan = new Scanner(System.in); 
		
		int n; 
		int x;
		int num; // 반복문 안의 수
		
		n = scan.nextInt();
		x = scan.nextInt();
		
		for (int i = 1; i <= n; i++) { // n수열을 n개로 배열
				num = scan.nextInt(); // 반복해서 저장
				if (num < x) { // x보다 작으면 입력 받은 수 출력
				System.out.print(num + " ");
			}
		}
		
	}
	
	public static void method1() {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int x;
		int i=1; // 반복 횟수
		int num;
		
		n = scan.nextInt();
		x = scan.nextInt();
		
		do {
			num = scan.nextInt();
			if(num < x) {
				System.out.print(num + " ");
			}
			i++;
		}while(i<=n);
		
	}

}
	