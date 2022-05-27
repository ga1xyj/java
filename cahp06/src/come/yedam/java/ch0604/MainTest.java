package come.yedam.java.ch0604;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Program program = new Program();
		
		while(run) {
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생 수> ");
				int student = sc.nextInt();
				program.setStudentNum(student);
			}else if(selectNo == 2) {
				System.out.print("점수> ");
				int score = sc.nextInt();
				program.setStudentScore(score); // 메소드 호출
			}else if(selectNo == 3) {
				program.printScores();
			}else if(selectNo == 4) {
				program.printResult();
			}else if(selectNo == 5) {
				run = false;()
				System.out.println("프로그램 종료");
			}
		}
	}

}
