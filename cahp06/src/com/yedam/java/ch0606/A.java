package com.yedam.java.ch0606;

class A {} // default

class B { // defualt는 같은 패키지 안에서는 뭘 하든 상관없음
	A a;
	B(A a) {
		this.a = a;
	}
	void method() {
		A a;
	}
}


