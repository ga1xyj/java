package chap01;

public class Hello {

	public static void main(String[] args) {
		//영어로 인사
		greetEn();		//메소드 실행(호출)
		
		//한글로 인사
		greet();
		
		//자기이름 소개
		info();
		
		System.out.println("자바는");
		System.out.println("\n재미있는 \"프로그래밍\" 언어\n");
		System.out.println("입니다.");
		
		}
		
	
	//메소드 선언
	public static void greetEn() {
		System.out.println("hello");
	}
	
	public static void greet() {
		System.out.println("안녕");
	}	
	
	public static void info() {
		System.out.println("주은하");		
	}
	
}
