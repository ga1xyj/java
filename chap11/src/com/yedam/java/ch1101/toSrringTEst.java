package com.yedam.java.ch1101;

import java.util.Date;

public class toSrringTEst {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		
		Date date = new Date();
		System.out.println(date.toString());
		
		Member member = new Member("홍길동");
		System.out.println(member); //member와 memeber.toString 두개가 같다
		System.out.println(member.toString());
				
	}
}
