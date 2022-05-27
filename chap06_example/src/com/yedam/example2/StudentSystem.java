package com.yedam.example2;

public class StudentSystem {

	public static void main(String[] args) {
		Student joo = new Student("주은하");
		
		System.out.println(Student.getSerialNum());
		System.out.println(joo.getName() +"의 학번 : " + joo.getStudentId());
		
		System.out.println(Student.getSerialNum());
		Student choi = new Student("최현정");
		System.out.println(choi.getName() +"의 학번 : " + choi.getStudentId());
		
		//인스턴스 값이라서 저장됨
		System.out.println(joo.getName() +"의 학번 : " + joo.getStudentId());
	

}
}
