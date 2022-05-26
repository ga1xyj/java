package com.yedam.java.example1;

public class Customer {
	//필드
	int customerId; //고객아이디
	String customerName; //고객이름
	String customerGrade; //고객등급
	int bonusPoint; //보너스 포인트
	double bonusRatio;//적립율 (비율->double)
	
	//생성자
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	//메소드
	//가격계산
	public int calPrice(int price) {
		this.bonusPoint += price * bonusRatio;
		return price;
	} 
	
	//정보출력
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	//고객아이디
	public int setCustomerId(int customerId) {
		this.customerId = customerId;
		return customerId;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	//고객이름
	public String setCustomerName(String customerName) {
		this.customerName = customerName;
		return customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	//고객등급
	public String setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
		return customerGrade;
	} 
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	//보너스 포인트
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	//보너스 포인트 적립율
	public int setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
		return bonusPoint;
	} 
	
	public double getBonusRatio() {
		return bonusRatio;
	}

}
