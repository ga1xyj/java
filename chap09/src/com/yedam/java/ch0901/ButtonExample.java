package com.yedam.java.ch0901;

public class ButtonExample {

	public static void main(String[] args) {
		Button button = new Button();
		
		button.setOnClickListerner(new CallListener());
		button.touch();
		button.setOnClickListerner(new MessageListener());
		button.touch();
	}

}
