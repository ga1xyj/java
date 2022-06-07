package question3_2;

public class RPGgame implements Keypad {
	private int nowMode;
	
	public RPGgame() {
		System.out.println("RPGgame 실행");
		this.nowMode = NORMAL_MODE;
	}
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if(nowMode == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} else {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if(nowMode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		} else {
			System.out.println("캐릭터가 HIT 공격");
		}
	}

	@Override
	public void changeMode() {
		if(nowMode == NORMAL_MODE) {
			nowMode = HARD_MODE;
			System.out.println("현재모드 : HARD_MODE");
		} else {
			nowMode = NORMAL_MODE;
			System.out.println("현재모드 : NORMAL_MODE");
		}
	}

}
