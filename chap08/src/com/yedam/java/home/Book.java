package com.yedam.java.home;

public class Book {

	private int isbn;
	private String name;
	private int price;
	
	public Book() {}
	
	public Book(int isbn, String name, int price) {
		this.isbn = isbn;
		this.name = name;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("isbn : " + isbn + ", 제목 : " + name + ", 가격 : " + price);
	}
	
}
