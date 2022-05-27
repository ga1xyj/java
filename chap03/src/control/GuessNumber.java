package control;

import java.util.Scanner;

public class GuessNumber {
	// 숫자 맞추기
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rand = (int) (Math.random() * 10) + 1; // 나중에 난수로 바꿀것임
		int num; // 유저가 입력하는 값
		int count = 0;
		//String result; // 비교 결과를 저장
		
		/* do {
			num = Integer.parseInt(scan.nextLine()); // 키보드 정수값을 읽어서 num 변수에 저장
			if(rand > num) { // rand > num "크다" 출력
				result = "크다";
			} else if(rand < num) { // rand < num "작다" 출력
				result = "작다";
			} else { // rand == num break
				result = "정답";
				System.out.println(result);
				break;
			}
			
			System.out.println(result);
			
		} while(true);
		*/

		do {
			count++;
			num = scan.nextInt(); // 키보드 정수값을 읽어서 num 변수에 저장
			if(rand > num) { // 숫자를 비교 맞으면 종료
				System.out.println("크다");
			} else if(rand < num ) {
				System.out.println("작다");
			} else {
				System.out.println("맞다");
				break;
			}
			if(count >= 5) {
				break;// count(시도횟수가) 5회 이상이면 게임 종료
			}
		} while(true);
	}
}
