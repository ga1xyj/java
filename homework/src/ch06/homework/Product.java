package ch06.homework;

public class Product {
	//상품에 대한 정보를 가지는 클래스: 상품명, 가격
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println(name + " : " + price);
	}
	
	//메소드
}
