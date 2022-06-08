package com.yedam.java.test2;

public class StudentSystem {
	   private Student[] list;
	   private int index;

	   public StudentSystem() {
	      index = -1;
	   }

	   public void setListSize(int size) {
	      list = new Student[size];
	   }

	   public void putStudentList(int studentId, String name, int price) {
	      Student student = new  Student(studentId, name, price);
	      list[++index] = student;
	   }

	   public void printStudentList() {
	      for(int i=0;i<=index; i++) {
	         list[i].printInfo();
	      }
	   }
	   Student getMaxInfo() {
	      Student maxInfo = list[0];
	      for(int i=0; i<=index; i++) {
	         if(maxInfo.getScore()<list[i].getScore()) {
	            maxInfo = list[i];
	         }
	      } return maxInfo;
	   }

	   Student getMinInfo() {
	      Student minInfo = list[0];
	      for(int i=0; i<=index; i++) {
	         if(minInfo.getScore()>list[i].getScore()) {
	            minInfo = list[i];
	         }
	      } return minInfo;
	   }

	   double getAvg() {
	      int sum = 0;
	      double avg = 0;
	      for(int i=0; i<=index; i++) {
	         sum += list[i].getScore();
	      } avg = (double)(sum - getMinInfo().getScore() - getMaxInfo().getScore())/(list.length-2);
	      return avg; // 메소드도 불러올 수 있음
	   }
	 }