package com.yedam.java.ch1201;

public class ThreadB extends Thread {
//스레드 자체 상속
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("현재 순서 : " + i);
			try {
				Thread.sleep(500);// ms단위 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 스레드 정지
		}
	}
}
