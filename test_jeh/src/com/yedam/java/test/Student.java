package com.yedam.java.test;

public class Student {
	int studentId;
	String name;
	int score;
	
	Student(int studentId, String name, int score) {
		this.studentId = studentId;
		this.name = name;
		this.score = score;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void showInfo() {
		System.out.println(studentId + " 학번의 점수는 " + score + "입니다.");
	}
	
	
}
