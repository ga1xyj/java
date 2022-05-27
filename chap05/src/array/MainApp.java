package array;

import java.util.Scanner;

public class MainApp {

	static int scores[]; // 어디에서나 다 쓸수 있음 // 배열 선언
	static Scanner scan = new Scanner(System.in);
	//static int menu;
	
	public static void main(String[] args) {
		init(); // 배열생성과 초기화
		int menu;
		//반복문
			//메뉴 출력 입력 1.전체출력 2.최솟값 3.최대값 4.평균 5.종류
			//메뉴입력
			//메뉴가 1이면
		do {
			System.out.println("1.전체출력 2.최솟값 3.최대값 4.평균 5.종류");
			System.out.print("선택>");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				findAll();
				break;
			case 2:
				findMin();
				break;
			case 3:
				findMax();
				break;
			case 4:
				findAvg();
				break;
			case 5:
				break; 
			default:
				System.out.println("1~5까지 출력하세요.");
			}
		} while(menu != 5);
	}

	public static void init() {
		System.out.println("값을 입력하세요");
		scores = new int[10]; // 배열 생성
		// 배열 초기화
		for (int i = 0; i <= 9; i++) {
			scores[i] = scan.nextInt();
		}
	}
	
	// 배열값 전체 조회
	public static void findAll() {
		for(int i=0; i<=9; i++) { System.out.println(scores[i]); } // 2번 학생 성적 조회
	 }

	// 최댓값
	public static void findMax() {
		int max = scores[0];
		for (int i = 1; i < 10; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.printf("최댓값은 %d점입니다.\n", max);
	}

	// 최솟값
	public static void findMin() {
		int min = scores[0];

		for (int i = 1; i < 10; i++) {
			if (min > scores[i]) {
				min = scores[i];
			}
		}
		System.out.printf("최솟값은 %d점입니다.\n", min);

	}

	// 평균 구하기
	public static void findAvg() {
	double avg;
	int sum = 0;
	for(int i = 0;i<10;i++) {
		sum += scores[i];
	}	avg=sum/10;
		System.out.printf("평균은 %.2f점입니다.\n", avg);
	}

}



