package com.yedam.java.home;

import java.util.Scanner;

public class BookSystem implements BookProgram {
	private Scanner sc = new Scanner(System.in);
	private static int seriaIsbn = 1000;
	private int isbnNum;

	@Override
	public void menuPrint() {
		System.out.println("===========================================");
		System.out.println("1.정보입력 | 2.전체조회 | 3.검색 | 4.분석 | 5.종료");
		System.out.println("===========================================");
	}

	@Override
	public void inputInfo(BookAccess access) {
		Book info = inputAll();
		access.insert(info);
	}
	
	private Book inputAll() {
		int isbn = isbnSystem();
		System.out.println("ISBN> " + isbnNum);
		System.out.print("이름> ");
		String name = sc.next();
		System.out.print("가격> ");
		int price = sc.nextInt();
		return new Book(isbn, name, price);
	}
	
	private int isbnSystem() {
		seriaIsbn++;
		this.isbnNum = seriaIsbn;
		return isbnNum;
	}
	
	@Override
	public void printAllInfo(BookAccess access) {
		Book[] list = access.selectAll();
		for(Book book : list) {
			book.showInfo();
		}
	}

	@Override
	public void printInfo(BookAccess access) {
		int isbn = inputIsbn();
		Book info = access.selectOne(isbn);
		info.showInfo();
	}
	
	private int inputIsbn() {
		System.out.print("ISBN 검색> ");
		return sc.nextInt();
	}

	@Override
	public void printRepot(BookAccess access) {
		System.out.print("최고 가격> ");
		Book maxInfo = selectMaxPrice(access);
		maxInfo.showInfo();
		System.out.print("최저 가격> ");
		Book minInfo = selectMinPrice(access);
		minInfo.showInfo();
		System.out.print("최고, 최저 가격을 제외한 총합의 평균> ");
		double  avgResult = calAvg(access);
		System.out.println(avgResult);
	}
	
	private Book selectMaxPrice(BookAccess access) {
		Book[] list = access.selectAll();
		Book maxInfo = list[0];
		for(int i=1; i<list.length; i++) {
			if(maxInfo.getPrice()<list[i].getPrice()) {
				maxInfo=list[i];
			}
		}
		return maxInfo;
	}
	
	private Book selectMinPrice(BookAccess access) {
		Book[] list = access.selectAll();
		Book minInfo = list[0];
		for(int i=1; i<list.length; i++) {
			if(minInfo.getPrice()>list[i].getPrice()) {
				minInfo=list[i];
			}
		}
		return minInfo;
	}

	private double calAvg(BookAccess access) {
		Book[] list = access.selectAll();
		int sum = 0;
		for(Book info : list) {
			sum += info.getPrice();
		}
		return (double)(sum-selectMaxPrice(access).getPrice()-selectMinPrice(access).getPrice())/(list.length-2);
	}
}
