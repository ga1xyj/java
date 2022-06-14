package com.yedam.java.ch01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 예외 trhows
		OutputStream os = new FileOutputStream("D:/dev/temp/test1.db");
		byte a = 10;
		byte b = 20;
		byte c = 30;

		os.write(a);
		os.write(b);
		os.write(c);
		
		//끝쪽으로 밀어냄 - 안 하면 중간에 손실됨
		os.flush();
		//출력 스트림 닫기
		os.close();
		
		//새로운 스트림 만들기
		os = new FileOutputStream("D:/dev/temp/test2.db");
		byte[] array1 = {10, 20, 30};
		os.write(array1);
		os.flush();
		os.close();
		
		//배열값+인덱스 입력
		os = new FileOutputStream("D:/dev/temp/test3.db");
		byte[] array2 = {10, 20, 30, 40, 50};
		//3번째 인덱스부터 2개의 값 출력
		os.write(array2, 3, 2);
		os.flush();
		os.close();
	}
}
