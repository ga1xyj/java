package chap01;

import java.util.Scanner; // 다른 패키지에서 호출

public class ScannerUtil {

	public static void main(String[] args) {
		
		String name, job;
		int age;
	
		// 문자열 입력
		Scanner scan = new Scanner(System.in); 
		// 프롬프트 출력
		System.out.print("이름입력:");
		// 문자열 입력 받아서 변수에 저장 (스캐너 생성, 키보드로 입력)
		// 엔터키 이전까지 입력
		name = scan.nextLine();
		
		System.out.print("직업입력:");
		job = scan.nextLine();
		
		System.out.print("나이입력:");
		age = Integer.parseInt(scan.nextLine()); // int 타입으로 변경
		
		// 입력 받은 문자열을 출력 (String 변수 선언 및 String 으로 읽기)
		System.out.printf("이름:%s \n직업:%s \n나이:%s", name, job, age);
	}

}
