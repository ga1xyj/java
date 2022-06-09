package com.yedam.java.ch1202;

public class ThreadTest {

	public static void main(String[] args) {
		//boolean 타입
		ThreadA thread = new ThreadA();
		thread.start();
		
		try {
			Thread.sleep(2000);
			//sleep을 만나기 전까지(2초) 실행
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.setStop(true);
		//자동으로 종료됨
		//interrupted 메소드 사용
		System.out.println("-------------------------------");
		//sleep이 들어가길 기다리지 않아도됨
		Thread sub = new Thread() {
			//익명 자식 객체
			@Override
			public void run() {
				while(true) {
					if(Thread.interrupted())
						break;
					System.out.println("***실행 중***");
				}
				System.out.println("***자원 정리***");
				System.out.println("***종료***");
			}
		};
		sub.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		sub.interrupt();
	}

}
