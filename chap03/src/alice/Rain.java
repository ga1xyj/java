package alice;

import java.util.Scanner;

public class Rain {
	// 우산 확률 계산기
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rain = Integer.parseInt(scan.nextLine());
		
		if (rain >= 50) {
			System.out.println("우산을 챙긴다");
		} else {
			System.out.println("그냥 간다");
		}
		
	}

}
