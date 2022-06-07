package com.yedam.java.ch1103;

import java.text.SimpleDateFormat;
import java.util.Date;
//단순 현재 정보 출력시 사용 
public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); //서구권식
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //형식 변경(문자열로 출력됨)
		
		String result = sdf.format(now); //format 클래스 사용
		System.out.println(result);
	}

}
