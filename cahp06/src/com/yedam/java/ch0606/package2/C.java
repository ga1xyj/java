package com.yedam.java.ch0606.package2;

import com.yedam.java.ch0606.package1.A;

public class C {
	A a1 = new A(true); // public은 프로젝트만 벗어나지 않으면됨
	A a2 = new A(1); //default도 오류남
	A a3 = new A("문자열");

// 생성자
	public C() {
		A a = new A(); //인스턴스
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;

		a.method1();
		a.method2();
		a.method3();
	}
}
