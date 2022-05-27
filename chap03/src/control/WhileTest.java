package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) throws FileNotFoundException {
		//while1();
		//for1();
		//for2();
		//gugudan1();
		//findMax(); // 최댓값
		//findMin();
		findMinMax();
	}
	
	public static void findMinMax() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("score.txt"));
		int min = scan.nextInt();
		int max = min;
		// 9번 반복
		for(int i=0; i<9; i++) {
			int num = scan.nextInt();
			if (num > max) {
				max = num;
			} else if (num < min) {
				min = num;
			}
		}
		System.out.println("최댓값은 "+max+" 최솟값은 "+min);
	}
		
	// 최댓값 구하기
	public static void findMax() throws FileNotFoundException { // 파일에서 입력받을 것임
		Scanner scan = new Scanner(new File("score.txt"));
		int max = 0;
		// 10번 반복
		for(int i=0; i<10; i++) {
			int num = scan.nextInt();
			//큰 수 보다 크면 출력
			if (num > max) {
				max = num;
			}
		}
		System.out.println("최댓값=" + max);
	}
	
	// 최솟값 구하기
	public static void findMin() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("score.txt"));
		int min = 100;
		for (int i=0; i<10; i++) {
			int num = scan.nextInt();
			if (num < min) {
				min = num;
			}
		}
		System.out.println("최솟값=" + min);
	}
		
		/*int num;
		
		for (int i = 1; i <= 10; i++) {
			num = scan.nextInt();
			if (num > 60) {
				System.out.println(num);
			}
		} */
		//10번 반복
			// 숫자를 입력
			// 60보다 크면 출력
	
	
	
	//5단 출력
	public static void gugudan1() {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%dx%d=%d\n", dan, i, dan*i);
			// System.out.println("5 x " + i + " = " + i*5)
		}
	}
	
	//10 ~ 1 출력
	public static void for2() {
		for(int i = 10; i >= 1; i--) {
			System.out.println(i + "반복");
		}
	}
	
	
	
	//1부터 10까지 반복 : do~while
	public static void while1()	{
		int count = 1;
		
		do {
			System.out.println(count);
			count++;
		} while(count <= 10);
	}
	
	//1부터 10까지 반복 : for
	public static void for1() {
		for (int i = 1; i <= 10; i=i+2) {
			System.out.println(i + "반복");
		}
	}
 
}
