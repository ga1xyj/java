package chap01;

import java.util.Scanner;

public class 사각형면적 {

	public static void main(String[] args) {
		
		int w, h, area; //변수 선언
		// area = w * h ; 오류
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로입력:");
		w = Integer.parseInt(scan.nextLine());
		
		System.out.println("세로입력:");
		h = Integer.parseInt(scan.nextLine());
		
		area = w * h ;
		System.out.println("면적=" + area);
		
		/* 
		
		System.out.println("가로입력:");
		int w = Integer.parseInt(scan.nextLine());	//가로 입력
		
		System.out.println("세로입력:");
		int t = Integer.parseInt(scan.nextLine());
		
		int area = w * t;					//면적 계산
		System.out.println("면적=" + area);  //면적 출력
		
		*/	
		
	}

}
