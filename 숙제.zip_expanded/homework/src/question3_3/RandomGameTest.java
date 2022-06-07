package question3_3;

import java.util.Scanner;

public class RandomGameTest {
	static Keypad keypad;
	static int gameMode;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		boolean run = true;
		GameSystem gameSystem = new GameSystem();
		gameMode = (int) (Math.random()*2);
		gameSet();
	while(run) {
		gameSystem.menuPrint();
		int menuNum = gameSystem.menuSelect();
		if(menuNum == 1) {
			keypad.leftUpButton();
		} else if(menuNum == 2) {
			keypad.leftDownButton();
		} else if(menuNum == 3) {
			keypad.rightUpButton();
		} else if(menuNum == 4) {
			keypad.rightDownButton();
		} else if(menuNum == 5) {
			keypad.changeMode();
		} else if(menuNum == 0) {
			gameChange();
		} else if(menuNum == 9) {
			System.out.println("EXIT");
			run = false;
		} else {
			System.out.println("다시 입력하세요.");
		}
	}

	
}
	public static void gameSet() {
		if (gameMode == 0) {
			keypad = new RPGgame();
		} else {
			keypad = new ArcadeGame();
		}
	}
	//?
	public static void gameChange() {
		if (gameMode == 0) {
			gameMode=1;
		} else {
			gameMode=0;

		}
		gameSet();
	} 
}
