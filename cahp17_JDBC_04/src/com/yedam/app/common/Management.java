package com.yedam.app.common;

import java.util.Scanner;

import com.yedam.app.ReceivingGoodsDAO;
import com.yedam.app.TakeoutGoodsDAO;
import com.yedam.app.products.ProductInfoManagement;
import com.yedam.app.products.ProductStockManagement;
import com.yedam.app.products.ProductDAO;

public class Management {
	//필드
	protected Scanner sc = new Scanner(System.in);
	protected ProductDAO pDAO = ProductDAO.getInstance();
	protected ReceivingGoodsDAO rDAO = ReceivingGoodsDAO.getInstance();
	protected TakeoutGoodsDAO tDAO = TakeoutGoodsDAO.getInstance();
	//미리 만들기
	
	//생성자
	public void run() {
		while(true) {
			menuPrint();
			int menuNo = menuSelect();
			if(menuNo == 1) {
				//제품 정보 관리
				new ProductInfoManagement(); //클래스로 생성
			}else if(menuNo == 2) {
				//제품 관리
				new ProductStockManagement();
			}else if(menuNo == 9) {
				exit();
				break;
				//프로그램 종료
			}else {
				//입력오류
				showInputError();
			}
			
		}
	}
	
	//메소드
	protected void menuPrint() {
		System.out.println("================================");
		System.out.println(" 1.제품정보관리 2.제품재과관리 9. 종료 ");
		System.out.println("================================");
	}
	
	protected int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력해주시기 바랍니다.");
		}
		return menuNo;
	}
	
	protected void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	protected void showInputError() {
		System.out.println("메뉴에서 입력해주시기 바랍니다.");
	}
	
	
	
	
}
