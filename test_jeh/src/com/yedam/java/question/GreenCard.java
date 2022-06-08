package com.yedam.java.question;

public class GreenCard implements Payment {
	public String name;
	public String grade;
	public double saleRatio;
	public int point;
	public double pointRatio;
	
	public GreenCard() {
		name = "GreenCard";
		grade = "Silver";
		saleRatio = 0;
		pointRatio = 0.05;
		point = 0;
	}
	
	@Override
	public int offline(int price) {
		point = (int) (pointRatio*price);
		price = (int) ((1-OFFLINE_PAYMENT_RATIO)*price);
		return price;
	}

	@Override
	public int online(int price) {
		point = (int) (pointRatio*price);
		price = (int) ((1-ONLINE_PAYMENT_RATIO)*price);
		return price;
	}

	@Override
	public int simple(int price) {
		point = (int) (pointRatio*price);
		price = (int) ((1-SIMPLE_PAYMENT_RATIO)*price);
		return price;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드명       :" + name);
		System.out.println("적용 등급     :" + grade);
		System.out.println("할인율       :" + saleRatio);
		System.out.println("포인트 적립율  :" + pointRatio);
		System.out.println("적립 포인트   :" + point);
	}
}
