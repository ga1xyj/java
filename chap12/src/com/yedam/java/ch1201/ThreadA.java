package com.yedam.java.ch1201;

public class ThreadA implements Runnable {
//Runnable 인터페이스 구현
	public void run() {
		for(int i=1; i<=5; i++) {
		System.out.println("현재 순서 : " + i);
		try {
			Thread.sleep(500);//ms단위 0.5초
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //스레드 정지
	}
	}

}
