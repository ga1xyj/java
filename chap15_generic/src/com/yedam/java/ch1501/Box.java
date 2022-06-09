package com.yedam.java.ch1501;

public class Box<T, V, K> {
	T t;
	V v;
	K k;
	int num;
	
	//제네릭타입 -> 타입 대체 
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public V getV() {
		return v;
	}
	
	public void setV(V v) {
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}
}
