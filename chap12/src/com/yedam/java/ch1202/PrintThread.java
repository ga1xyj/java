package com.yedam.java.ch1202;

public class PrintThread extends Thread{
	@Override
	public void run() {
		//무한반복
		//interrupt를 통해 작업 스레드를 종료시키고 싶을 때
		/*try {
		while(true) {
			System.out.println("실행중");
			Thread.sleep(1000);
			//없으면 오류
		}
		} catch(InterruptedException e) {
			System.out.println("interrupt method 실행");
		}
		System.out.println("자원 정리");
		System.out.println("종료");*/
		
		//interrupt 발생시 작업 중 일시적인 추가 작업이 필요한 경우
			while(true) {
				System.out.println("실행중");
				try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("interrupt method 실행");
			}
	}
  }
}
