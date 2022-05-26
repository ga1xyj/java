package com.yedam.java.example1;

public class Gold extends Customer {
	double discountRatio;

	public Gold(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.discountRatio = 0.1;
	}

	@Override
	public int calPrice(int price) {
		//super.calcPrice(price);
		//price *= (1 - discountRatio);
		//return price;
		this.bonusPoint += price * bonusRatio;
		return (int)(price * (1-discountRatio));
	}

	//할인율
	public void setDiscountRatio(double discountRatio) {
		this.discountRatio = discountRatio;
	}

	public double getDiscountRation() {
		return discountRatio;
	}
	
	
}
