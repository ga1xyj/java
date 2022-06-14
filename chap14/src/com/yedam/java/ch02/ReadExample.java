package com.yedam.java.ch02;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:/dev/temp/test7.txt");
		// 읽어올때는 byte 단위와 비슷하다

		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			// char로 형변환
			System.out.println((char) data);
		}
		reader.close();
		System.out.println();

		// byte단위도 잘 됨
		reader = new FileReader("D:/dev/temp/test1.db");
		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			System.out.println(data);
		}
		reader.close();
		System.out.println();
		reader = new FileReader("D:/dev/temp/test7.txt");
		char[] buffer = new char[100]; // 배열이 char타입이라 캐스팅 할 필요 x
		while (true) {
			int readCharNum = reader.read(buffer);
			if (readCharNum == -1)
				break;
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
		System.out.println();

		reader = new FileReader("D:/dev/temp/test10.txt");

		int readCharNum = reader.read(buffer, 5, 10);
		for (int i = 0; i < (5 + readCharNum); i++) {
			System.out.print(buffer[i]);
		}

		reader.close();
	}
}
