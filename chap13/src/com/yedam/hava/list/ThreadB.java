package com.yedam.hava.list;

import java.util.List;

public class ThreadB extends Thread {
private List<Integer> list;
	
	public void setList(List<Integer> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			list.remove(i);
		}
		for(int data : list) {
			System.out.println(Thread.currentThread().getName()+" : "+data);
		}
		
	}
}
