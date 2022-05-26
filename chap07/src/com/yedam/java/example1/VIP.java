package com.yedam.java.example1;

public class VIP extends Customer {
	double discountRatio;
	String counselor;
	
	public VIP(int customerId, String customerName, String counselor) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.discountRatio = 0.15;
		this.counselor = counselor;
	}
	
	@Override
	public int calPrice(int price) {
		this.bonusPoint += price * bonusRatio;
		return (int)(price * (1-discountRatio));
	} 
	
	@Override
	public String showInfo() {
		return super.showInfo() + "\n담당 상담원은 " + counselor + "입니다.";
	}

	//할인율
	public double getDiscountRatio() {
		return discountRatio;
	}

	public void setDiscountRatio(double discountRatio) {
		this.discountRatio = discountRatio;
	}
	
	//상담원
	public String getCounselor() {
		return counselor;
	}

	public void setCounselor(String counselor) {
		this.counselor = counselor;
	}
	
	
	
}
