package com.yedam.java.ch0901;

public class Button {
	
	OnClickListener listener; //필드
	void setOnClickListerner(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{ //서로 연관성
		void onClick();
		
	}
}
