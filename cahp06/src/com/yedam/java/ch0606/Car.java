package com.yedam.java.ch0606;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	public int getSpeed() {
		return speed; // return값 정하면 매개변수 x?
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed=speed;
		}
	}
	
	public boolean isStop() { //boolean 타입은 is로 시작
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}


