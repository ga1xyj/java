package com.yedam.example2;

public class Card {
	
	private static int serialNum = 2000;
	private int cardNum;
	//private String name;
	
	public Card() {
		serialNum++;
		this.cardNum = serialNum;
		//this.name = name;
	}
	
	public int getCardNum() {
		return serialNum;
	}
	
	public int getCardId() {
		return cardNum;
	}
	
	/*public String getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println("카드번호는 " + cardNum + "입니다");
	}*/
}
