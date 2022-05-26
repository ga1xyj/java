package com.yedam.java.test2;

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
	
	public void printInfo() {
		System.out.println(studentId + " 학번의 점수는 " + score + "입니다.");
	}
}
