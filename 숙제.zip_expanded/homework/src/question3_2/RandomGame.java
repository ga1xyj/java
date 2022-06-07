package question3_2;

import java.util.Scanner;

public class RandomGame {
	private Keypad game; //현재 게임이 뭔지 저장할 필드
	
	public RandomGame() { //생성자 통해서
		setRandomGame();
		while(true) {
			//메뉴출력
			menuPrint();
			//메뉴입력
			int menuNo = menuSelect();
			//기능별 실행
			if(menuNo==1) {
				game.leftDownButton();
			}else if(menuNo ==2) {
				game.leftDownButton();
			}else if(menuNo ==3) {
				game.rightUpButton();
			}else if(menuNo ==4) {
				game.rightDownButton();
			}else if(menuNo ==5) {
				game.changeMode();
			}else if(menuNo ==0) {
				setRandomGame();
			}else if(menuNo ==9) {
				exit();
				break;
			} else {
				printInputError();
			}
		}
	}
	
	private void menuPrint() {
		System.out.println("============================================================================================");
		System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
		System.out.println("============================================================================================");
	}
	
	private int menuSelect() {
		System.out.print("choice>>");
		return new Scanner(System.in).nextInt(); // 스캐너 바로 호출
	}
	
	private void exit() {
		System.out.println("EXIT");
	}
	
	private void printInputError() {
		System.out.println("메뉴를 잘못 선택하였습니다.");
	}
	
	private void setRandomGame() {
		int random = (int)(Math.random()*2);
		switch(random) {
		case 0:
			game = new RPGgame();
			break;
		case 1:
			game = new ArcadeGame();
			break;
		}
	}
	
}
