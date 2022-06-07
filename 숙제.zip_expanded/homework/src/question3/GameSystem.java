package question3;

import java.util.Scanner;

public class GameSystem {
	private Scanner sc = new Scanner(System.in);
	private int gameMode;
	private Keypad keypad;

	public void gameSet() {
		gameMode = (int) (Math.random())*2;
		if (gameMode == 0) {
			keypad = new RPGgame();
		} else {
			keypad = new ArcadeGame();
		}
	}

	public void menuPrint() {
		System.out.println("======================================================================================");
		System.out.println("1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT");
		System.out.println("======================================================================================");
	}

	public int menuSelect() {
		System.out.print("choice>>");
		return sc.nextInt();
	}

}
