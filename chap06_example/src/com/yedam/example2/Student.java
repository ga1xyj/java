package com.yedam.example2;

public class Student {
	//필드
	private static int serialNum = 1000;
	
	private int studentId;//학번
	private String name;//이름
	
	//생성자
	public Student(String name) {
		serialNum++;//누적시킴
		//다른 인스턴스에도 접근됨
		this.studentId = serialNum; // 일시적 복사
		this.name = name;
	}
	
	//메소드
	public static int getSerialNum() {
		return serialNum; //getter는 return값이 필요하다
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
}
