package com.yedam.example2;

//싱글톤
public class CardFactory {
	// 필드
	private static CardFactory instance = new CardFactory();
	//private
	
	// 생성자
	private CardFactory() { //private
	}

	// 메소드
	public static CardFactory getInstance() {
		return instance;
	}

	public Card createCard() {
		return new Card(); // new 연산자 이용해서 return
	}

}


