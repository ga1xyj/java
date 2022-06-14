package com.yedam.java.ch01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/dev/temp/test1.db");
		// 파일 전체라서 반복문 사용
		while (true) {
			int data = is.read();
			// 값이 없을 때는 -1을 반환 -> 끝에 도달
			// 매개변수 없을 때 리턴되는 값이 내가 읽어들인 값
			if (data == -1)
				break;
			System.out.println(data);
		}
		is.close();
		System.out.println("-------------");
		
		is = new FileInputStream("D:/dev/temp/test2.db");
		byte[] buffer = new byte[100];
		while (true) {
			int readByteNum = is.read(buffer);
			// 바이트배열에 읽어들인 값을 넣고 내가 몇개의 값을 읽어들였는지 리턴
			// 리턴되는 타입을 변수로 받음
			if (readByteNum == -1)
				break;
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
			System.out.println();
		}
		is.close();
		System.out.println("-------------");
		//기존 값에 붙여서 쓰는법(배열)
		is = new FileInputStream("D:/dev/temp/test3.db");
		//인덱스 3부터 2개의 값
		int readByteNum = is.read(buffer, 3, 2);
		for(int i=0; i<(3+readByteNum); i++) {
			System.out.println(buffer[i]);
		}
		is.close();
		System.out.println("-------------");
		//기존 값에 붙여서 쓰는법(배열)
		is = new FileInputStream("D:/dev/temp/test3.db");
		while(true) {
			int data = is.read();
			if(data == -1) break;
			System.out.println(data);
		}
	}  
}
