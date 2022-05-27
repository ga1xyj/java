package chap01;

import java.util.Scanner;

public class 숙제1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		String strNum = scanner.nextLine();
				
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		
		System.out.println("덧셈 결과:" + result);
		
	}

}
