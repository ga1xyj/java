package com.yedam.app.products;

import com.yedam.app.common.Management;

public class ProductInfoManagement extends Management {
	//product 테이블 정보 DML
	//제품에 대한 정보를 등록, 수정, 삭제
	//별도의 필드 없이 그대로 구현
	public ProductInfoManagement() {
		while(true) {
			menuPrint();
				
			int menuNo = menuSelect();
			if(menuNo == 1) {
				//제품정보등록
				insertProductInfo();
			}else if(menuNo == 2) {
				//제품정보수정
				//사용자가 원하면 둘다 수정이 가능하도록
				updateProductInfo();
			}else if(menuNo == 3) {
				//제품정보삭제
				deleteProductInfo();
			}else if(menuNo == 9) {
				//뒤로가기
				//management로 돌아감
				back();
				break;
			}else {
				//입력오류
				showInputError();
			}
		}
	}
	
	@Override
	protected void menuPrint() {
		System.out.println("=====================================");
		System.out.println(" 1.제품등록 2.제품수정 3.제품삭제 9.뒤로가기 ");
		System.out.println("=====================================");
	}
	
	private void back() {
		System.out.println("메인으로 돌아갑니다.");
	}
	
	private void insertProductInfo() {
		//제품 정보 입력
		Product product = inputAll();
		//DB에 저장
		pDAO.insert(product);
	}
	
	private void deleteProductInfo() {
		//제품이름 입력
		String productName = inputName();
		//제품정보 검색
		//-1 products 테이블에서 정보
		Product product = pDAO.selectOne(productName);
		if(product == null) {
			System.out.println("등록된 정보가 없습니다.");
			return;
			//정보가 없으면 멈춤
		}
		//-2 입고내역에서 검색
		boolean isSelected = rDAO.selectInfo(product.getProductId());
		
		//DB에서 삭제
		//!:반전연산자
		if(!isSelected) {
			pDAO.delete(product.getProductId());
		} else {
			System.out.println("거래내역이 존재합니다.");
		}
	}
	
	private void updateProductInfo() {
		//제품이름 입력
		String productName = inputName();
		//제품정보 검색
		Product product = pDAO.selectOne(productName);
		//수정할 정보 입력
		if(product == null) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
		//수정할 정보 입력
		product = inputUpdateInfo(product);
		//기존의 정보를 받아서 새로운 정보 반환
		
		//DB 수정
		//수정된 정보를 가지고 있는 변수 넘김
		pDAO.updateInfo(product);
		//무조건 실행됨
	}
	
	private Product inputAll() {
		Product product = new Product();
		System.out.print("제품이름>");
		product.setProductName(sc.nextLine());
		System.out.print("제품가격>");
		product.setProductPrice(Integer.parseInt(sc.nextLine()));
		return product;
	}
	
	private String inputName() {
		System.out.print("제품이름>");
		return sc.nextLine();
	}
	
	private Product inputUpdateInfo(Product product) {
		System.out.println("기존> " + product.getProductName());
		System.out.print("수정(수정하지 않을 경우 0 입력)>");
		String name = sc.nextLine();
		if(name.equals("0")) {
			product.setProductName(name);
		}
		System.out.println("기존> " + product.getProductPrice());
		System.out.print("수정(수정하지 않을 경우 -1 입력)>");
		int price = Integer.parseInt(sc.nextLine());
		if(price > -1) {
			product.setProductPrice(price);
		}
		return product;
	}
	
}
