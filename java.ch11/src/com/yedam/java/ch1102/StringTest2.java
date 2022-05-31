package com.yedam.java.ch1102;

public class StringTest2 {

	public static void main(String[] args) {
		// toLowerCase
		String str1 = "Java Programing"; // 논리적으로는 SAME
		String str2 = "JAVA PROGRAMING";
		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 값입니다.");
		} else {
			System.out.println("str1과 str2는 다른 값입니다.");
			// 자바는 다르다고 인식
		}
		String val1 = str1.toLowerCase();
		String val2 = str2.toLowerCase();
		if (val1.equals(val2)) {
			System.out.println("val1과 val2는 같은 값입니다.");
		} else {
			System.out.println("val1과 val2는 다른 값입니다.");
			// 자바는 다르다고 인식
		}
		// equlsIgnore 대소문자 무시하고 값 비교
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("str1과 str2는 같은 값입니다.");
		} else {
			System.out.println("str1과 str2는 다른 값입니다.");
		}

		// Trim : 공백제거
		// 중간에 있는 공백은 제거불가
		String subject = "          자바      프로그래밍             ";
		String newData = subject.trim();
		//System.out.println(newData);
		//System.out.println(subject.substring(10, 13) + subject.substring(18, 24));
		//잘라붙이는법
		String data1= newData.substring(0,2);
		String data2 = newData.substring(newData.indexOf("프로그래밍"));
		String result = data1 + " " + data2;
		System.out.println(newData);
		System.out.println(result);
		
		//valueOf
		String value1 = String.valueOf(10);
		String value2 = String.valueOf(10.5);
		String value3 = String.valueOf(true);
		String value4 = "" + 100;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}
}
