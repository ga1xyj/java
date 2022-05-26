package com.yedam.java.test;

public class StudentSystem {
	private Student[] list;
	private int index;

	public StudentSystem() {
		index = -1;
	}

	// 1.학생 수 입력
	public void setListSize(int size) {
		list = new Student[size];
	}

	// 2.학생정보 등록
	public void putStudentList(int studentId, String name, int price) {
		Student student = new Student(studentId, name, price);
		list[++index] = student;
	}

	// 3.학생정보 전체조회
	public void printStudentList() {
		for (int i = 0; i <= index; i++) {
			list[i].showInfo();
		}
	}

	// 4.학생정보 분석
	int getMin() {
		int min = list[0].getScore();
		for(int i=0; i<=index; i++) {
			if(min>list[i].getScore()) {
				min = list[i].getScore();
			}
		}
		return min;
	}
	
	
	int getMax() {
		int max = 0;
		for(int i=0; i<=index; i++) {
			if(max<list[i].getScore()) {
				max = list[i].getScore();
			}
		}
		return max;
	}
	
	double getAvg() {
		int sum = 0;
		double avg = 0;
		for(int i=0; i<=index; i++) {
			sum += list[i].getScore();
		} avg = (double)(sum - getMin() - getMax())/(list.length-2);
		return avg;
	}
	
	int getMaxInfo() {
		int max = list[0].getScore();
		int maxInfo = list[0].getStudentId();
		for(int i=0; i<=index; i++) {
			if(max < list[i].getScore()) {
				max = list[i].getScore();
			maxInfo = list[i].getStudentId();
			}
		}
		return maxInfo;
	}
	
	int getMinInfo() {
		int min = list[0].getScore();
		int minInfo = list[0].getStudentId();
		for(int i=0; i<=index; i++) {
			if(min > list[i].getScore()) {
				min = list[i].getScore();
			minInfo = list[i].getStudentId();
			}
		}
		return minInfo;
	}
	
	public void printInfo() { // 오류
		System.out.println("최고 점수 : " + getMax() + ", 학번 : " + getMaxInfo());
		System.out.println("최저 점수 : " + getMin() + ", 학번 : " + getMinInfo());
		System.out.printf("최고점, 최저점을 제외한 평균 점수는 %.2f입니다.\n", getAvg());
	}
	
	
}
