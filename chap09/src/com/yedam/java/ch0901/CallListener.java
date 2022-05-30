package com.yedam.java.ch0901;
//버튼을 걸 때 전화 
public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
	
}
