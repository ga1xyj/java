package com.yedam.java.ch0606.package1;

public class B {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열"); // private이라 외부에서 보이지 않음

//생성자
	public B() {
		A a = new A(); //인스턴스
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;

		a.method1();
		a.method2();
		a.method3();
	}
}