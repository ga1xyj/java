package com.yedam.java.map;

public class Student {
	public String name;
	public int sno;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	//물리적으로 메모리상에 존재하는 위치가 같은지 유니크한 값?
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	//내부의 필드에 존재하는 값이 같은지
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			//타입변환
			Student s = (Student) obj;
			//학번끼리 이름은 이름대로 비교해서 모두 true가 나오도록
			return (name.equals(s.name)) && (s.sno==sno);
		} else {
			return false;
		}
	
	}

}
