package baekjoon.p10430;

import java.util.Scanner;

//나머지
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = scan.nextInt();
		}
		
		int result = num[0] % num[2];
		int result2 = num[1] % num[2];
		
		System.out.println((num[0] + num[1]) % num[2]);
		System.out.println((result + result2) % num[2]);
		System.out.println((num[0] * num[1]) % num[2]);
		System.out.println((result * result2) % num[2]);

	}

}
