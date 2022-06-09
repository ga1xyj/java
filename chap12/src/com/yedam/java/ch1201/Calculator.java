package com.yedam.java.ch1201;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//setMemory 메소드 이용해서 필드에 접근
	//필드를 건드는 것이 문제
	//동기화해주면 해결됨(순차적으로 접근할 수 있게 해 줌)
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			//interrupt가 걸리면 걸린 스레드가 뭔지 출력하게함
			//현재 스레드 + 메모리 출력
		}
		Thread info = Thread.currentThread();
		System.out.println("현재 스레드 : " + info.getName() + ", memory : " + this.memory);
	}
}
