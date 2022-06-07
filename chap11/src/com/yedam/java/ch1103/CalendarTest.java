package com.yedam.java.ch1103;

import java.util.Calendar;
//각각 구성요소 개별 사용시 사용
public class CalendarTest {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //getInstance이용해서 Instance 가져옴
		int year = now.get(Calendar.YEAR); //get으로 가져옴
		int month = now.get(Calendar.MONTH) + 1; //MONTH가 0부터 시작함
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch(week) { //바꿔줌
		case Calendar.MONDAY :
			strWeek = "월";
			break;
		case Calendar.TUESDAY :
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY :
			strWeek = "수";
			break;
		case Calendar.THURSDAY :
			strWeek = "목";
			break;
		case Calendar.FRIDAY :
			strWeek = "금";
			break;
		case Calendar.SATURDAY :
			strWeek = "토";
			break;
		case Calendar.SUNDAY :
			strWeek = "일";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.print(strWeek+"요일 ");
		System.out.print(strAmPm+" ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		System.out.println(second+"초 ");
	}

}
