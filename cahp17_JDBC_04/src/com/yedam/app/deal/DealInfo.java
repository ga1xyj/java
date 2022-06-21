package com.yedam.app.deal;

import java.sql.Date;

public class DealInfo {
	//각 테이블에 대응되는 형태 x
	//공용으로 쓰는 vo 클래스
	private Date dealDate;
	private int productId;
	private int productAmount;
	private String productName;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getDealDate() {
		return dealDate;
	}
	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	
	@Override
	public String toString() {
		String result = "거래일자 : " + dealDate + ", 제품번호 : " + productId;
		if(productName != null) {
			result += ", 제품이름 : " + productName;
		}
		//필요에 따라 productName 추가
		result += ", 수량 : " + productAmount;
		return result;
	}
}
