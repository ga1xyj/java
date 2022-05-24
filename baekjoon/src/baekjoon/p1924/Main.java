package baekjoon.p1924;

import java.util.Scanner;

public class Main {
//요일
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int date = scan.nextInt();
		int rest = date%7;
		String day = null;
		if(month==1 || month==10) {
			rest+=6;
		} else if(month==2 || month==3 || month==11) {
			rest+=2;
		} else if(month==4 || month==7) {
			rest+=5;
		} else if(month==6) {
			rest+=3;
		} else if(month==8) {
			rest+=1;
		} else if(month==9 || month==12) {
			rest+=4;
		}
		
		if(rest>=7) {
			rest-=7;
		}
		
		if(rest==0) {
			day="MON";
		} else if(rest==1) {
			day="TUE";
		} else if(rest==2) {
			day="WED";
		} else if(rest==3) {
			day="THU";
		} else if(rest==4) {
			day="FRI";
		} else if(rest==5) {
			day="SAT";
		} else if(rest==6) {
			day="SUN";
		}
		
			System.out.println(day);
		} 

	/*
	 *  {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int allDays = 0;
		int daysArr[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String dayArr[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		for (int i = 1; i < x; i++) {	
			allDays += daysArr[i];
		}
		
		System.out.println(dayArr[(allDays+y)%7]);
	}
	 */
	
	
	
	}
