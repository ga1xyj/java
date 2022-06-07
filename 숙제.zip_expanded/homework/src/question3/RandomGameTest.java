package question3;

import java.util.Scanner;

public class RandomGameTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GameSystem gameSystem = new GameSystem();
		boolean run = true;
		RPGgame rpg;
		ArcadeGame arcade;
		int gameMode;

		gameMode = (int) (Math.random()) * 2;
		rpg = new RPGgame();
		arcade = new ArcadeGame();

		if (gameMode == 0) {
			System.out.println("RPGgame 실행");
		} else if (gameMode == 1) {
			System.out.println("ArcadeGame 실행");
		}

		while (run) {
			if (gameMode == 0) {
				gameSystem.menuPrint();
				int menuNum = gameSystem.menuSelect();
				if (menuNum == 1) {
					rpg.leftUpButton();
				} else if (menuNum == 2) {
					rpg.leftDownButton();
				} else if (menuNum == 3) {
					rpg.rightUpButton();
				} else if (menuNum == 4) {
					rpg.rightDownButton();
				} else if (menuNum == 5) {
					rpg.changeMode();
				} else if (menuNum == 0) {
					gameMode = 1;
					System.out.println("ArcadeGame 실행");
				} else if (menuNum == 9) {
					System.out.println("EXIT");
					run = false;
				} else {
					System.out.println("다시 입력하세요.");
				}
			} else if (gameMode == 1) {
				gameSystem.menuPrint();
				int menuNum = gameSystem.menuSelect();
				if (menuNum == 1) {
					arcade.leftUpButton();
				} else if (menuNum == 2) {
					arcade.leftDownButton();
				} else if (menuNum == 3) {
					arcade.rightUpButton();
				} else if (menuNum == 4) {
					arcade.rightDownButton();
				} else if (menuNum == 5) {
					arcade.changeMode();
				} else if (menuNum == 0) {
					gameMode = 0;
					System.out.println("RPGGame 실행");
				} else if (menuNum == 9) {
					System.out.println("EXIT");
					run = false;
				} else {
					System.out.println("다시 입력하세요.");
				}
			}

		}

	}

}