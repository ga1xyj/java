package com.yedam.java.ch1102;

import java.io.UnsupportedEncodingException;

public class StringTest1 {

	public static void main(String[] args) {
		// byte type->String type
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// 정수타입:숫자
		// 아스키코드:문자
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4);
		// 6부터 4자리(시작은 0)
		System.out.println(str2);

		// String->byte->String
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1); // byte:사람은 인지x
		String strs1 = new String(bytes1); // byte->String
		System.out.println(strs1);

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2);
			String strs2 = new String(bytes1); // "EUC-KR"); //인코딩할때 기준
			System.out.println(strs2);

		} catch (UnsupportedEncodingException e) { // 예외처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 오류 생김
		System.out.println();
		// charAt
		String ssn = "010624-1230123";
		char gender = ssn.charAt(7); // index 7번째 복사
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
		// 응용하면 for문
		// String의 배열을 char타입으로
		for (int i = 0; i < ssn.length(); i++) {
			System.out.println(ssn.charAt(i));
		}

		System.out.println();

		// equals(String 타입 비교할 때)
		String val1 = "신민철";
		String val2 = "신민철"; // 새로운 인스턴스 생성x val1=val2는 똑같은 인스턴스를 공유
		String val3 = new String("신민철"); // 동일한 값이라해도 new 연산자 이용하면 다른 인스턴스

		if (val1.equals(val2)) {
			System.out.println("val1과 val2는 값이 같습니다.");
		} else {
			System.out.println("va1과 val2는 값이 다릅니다");
		}

		if (val1.equals(val3)) {
			System.out.println("val1과 val3은 값이 같습니다.");
		} else {
			System.out.println("va1과 val3은 값이 다릅니다");
		}
		System.out.println();
		if (val1 == val2) {
			System.out.println("val1과 val2는 같은 인스턴스입니다.");
		} else {
			System.out.println("va1과 val2는 다른 인스턴스입니다.");
		}
		if (val1 == val3) {
			System.out.println("val1과 val3은 같은 인스턴스입니다.");
		} else {
			System.out.println("va1과 val3은 다른 인스턴스입니다."); // ==연산자 쓰면 다르게 나옴
		}
		System.out.println();
		// indexOf
		// "그 값이 0보다 크다면 내가 원하는 값이 존재한다" 고 판단
		String subject = "자바 프로그래밍 & 스프링";
		int location = subject.indexOf("프로그래밍"); //동일한 단어가 있으면 첫번째것
		System.out.println(location);
		//찾고자하는 값이 없으면 -1을 알려줌
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
		//substring:필요한 부분만 꺼낼때 사용
		String result1 = subject.substring(subject.indexOf("프로그래밍"));
		System.out.println(result1);
		String ssn1 = "880815-1234567";
		System.out.println("생년월일:"+ssn1.substring(0, 6)); //시작지점,시작지점+1까지
		System.out.println("개별정보:"+ssn1.substring(7)); 
		
		//length
		String[] temp = {"1","2"};
		int val = temp.length; //length는 필드값
		System.out.println(ssn1.length());
		System.out.println();
		
		//replae(모든 단어 다 찾아줌)
		String oldStr = "Java 프로그래밍";
		String newStr = oldStr.replace("Java", "자바");//Java를 자바로 대체
		//원본데이터를 손대지 않고 바뀌지 않은 새로운 데이터 생성
		System.out.println(oldStr + "->" + newStr);
		}

}
