package com.yedam.java.ch1201;
//각각 출력은 문제 x
public class MultiThreadTest {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		//작업하는 메인스레드의 정보를 가져옴
		//run에서는 다 쓸 수 있음
		System.out.println("메인 스레드 : " + main.getName());
		
		//Runnable 구현
		//매개변수로 작동시키자 하는 스레드 넘겨줘야함
		/*Runnable a = new ThreadA(); //만들기
		Thread thread = new Thread(a); //작동
		thread.start();*/
		
		//스레드 상속
		ThreadB thread = new ThreadB();
		thread.setName("threadB");
		//스레드 이름 설정
		System.out.println("작업 스레드 : " + thread.getName());
		//임의로 부여된 이름 출력해주는 메소드
		thread.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println(i + "번째 출력");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
