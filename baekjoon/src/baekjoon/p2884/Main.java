package baekjoon.p2884;

import java.util.Scanner;
// 알람
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		int M2 =  M+15;
		
		if (H == 0 && M < 45) {
			System.out.printf("23 %d", M2);
		} else if (M < 45) {
			System.out.printf("%d %d", H-1, M2);
		} else {
			System.out.printf("%d %d", H, M-45);
		}
		
	}

}

/*
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		m = m-45;
		if(m<0) {
			h--;
			m += 60;
		}
		if(h<0) {
			h+=24;
		}
		System.out.print(h + " " + m);
	}
}
*/