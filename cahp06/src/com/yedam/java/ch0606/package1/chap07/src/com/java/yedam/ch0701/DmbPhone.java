package com.java.yedam.ch0701;
//상속이 일어날 수 있는 class는 protected이상
public class DmbPhone extends Phone {
	@Override
	protected void bell() {
		super.bell();
	}

	@Override
	void call() {
		super.call();
	}

	//필드
	int ch;
	
	//생성자
	public DmbPhone(String model, String color) {
		super(model, color); // 부모 것을 요청하려면 suepr 자바가 컴파일하면서 자동으로 추가
		//this.model = model; // this는 인스턴스(즉 내것)
		//this.color = color;
		this.ch = 10;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + ch + "번 방송 수신을 시작합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("방송 수신을 멈춥니다.");
	}
	
	void changeChannel(int ch) {
		this.ch = ch;
		System.out.println("채널 " + ch + "번 으로 바꿉니다.");
	}
 }
