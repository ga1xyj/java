package com.yedam.java.example1;

public class CustomoerTest {

	public static void main(String[] args) {
		Customer customer = new Customer(1001, "주은하");
		System.out.println(customer.showInfo());
		Gold gold = new Gold(1002, "주은영");
		System.out.println(gold.showInfo());
		VIP vip = new VIP(1003, "김땡땡", "박땡땡");
		System.out.println(vip.showInfo());
	}

}
