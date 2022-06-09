package com.yedam.java.ch1201;

public class MainThreadTest {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println("현재 순서 : " + i);
			try {
				Thread.sleep(500);//ms단위 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //스레드 정지
		}
		for(int i=1; i<=5; i++) {
			System.out.println(i + "번째 출력");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//메인스레드 안에서는 동시에 돌아가지 않고 순차적
	}

}
