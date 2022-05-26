package chap01;

import java.util.Scanner;

public class 삼각형면적 {

	public static void main(String[] args) {
		double w, h, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("밑변:");
		w = Double.parseDouble(scan.nextLine());
		
		System.out.print("높이:");
		h = Double.parseDouble(scan.nextLine());
		
		area = w * h / 2 ;

		System.out.printf("면적:%5.2f", area);
		
		
	}

}
