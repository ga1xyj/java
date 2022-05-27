package com.yedam.java.ch0801;

public interface RemoteControl {
	//상수 필드
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; 
	// 상수라서 값을 주지 않으면 오류 발생
	// static final은 생략 가능(자동으로 상수화)
	
	//추상메소드
	public abstract void turnOn();
	//abstract는 생략 가능(자동으로 추상화)
	public void turnOff();
	public void setVolume(int volume);
	
	//일반메소드
	public default void show() { // default를 붙여 추가 가능
		System.out.println("추가한 메소드");
	}
	
}
