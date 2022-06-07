package question3_3;

import java.util.Scanner;

public class GameSystem {
	private int gameMode;
	private Scanner sc = new Scanner(System.in);




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
