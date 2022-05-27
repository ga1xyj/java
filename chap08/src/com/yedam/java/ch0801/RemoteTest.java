package com.yedam.java.ch0801;

public class RemoteTest {

	public static void main(String[] args) {
		RemoteControl rc = new TV(); //RemoteControl = TV 구현 관계
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		SmartControl sc = new TV();
		sc.searchInternet("네이버");
		sc.searchInternet("구글");
		
		TV tv = new TV();
		tv.turnOn();
		
		//RemoteControl, SmartControl 구현할때는 불가능
		//Control con = new TV();
		
		Control con = new TV();
		con.turnOn();
		con.executeApp("게임");
	}

}
