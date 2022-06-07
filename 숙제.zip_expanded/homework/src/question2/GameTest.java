package question2;

public class GameTest {

	public static void main(String[] args) {
		RPGgame rpgGame = new RPGgame();
		
		rpgGame.leftUpButton();
		rpgGame.rightUpButton();
		rpgGame.changeMode();
		rpgGame.rightUpButton();
		rpgGame.rightDownButton();
		rpgGame.leftDownButton();
		rpgGame.changeMode();
		rpgGame.rightDownButton();
		
		System.out.println("======================");
		
		ArcadeGame arcadeGame = new ArcadeGame();	
		arcadeGame.leftUpButton();
		arcadeGame.rightUpButton();
		arcadeGame.leftDownButton();
		arcadeGame.changeMode();
		arcadeGame.rightUpButton();
		arcadeGame.leftUpButton();
		arcadeGame.rightDownButton();
		
	}

}
