package com.yedam.java.ch1501;

public class Util {
	// 제네릭클래스 타입의 제네릭 메소드
	public static <T> BoxA<T> boxing(T t) {
		BoxA<T> box = new BoxA<>();
		box.set(t);
		return box;
	}

	// 제네릭 메소드
	// Pair 클래스를 eqauls로 비교
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	// 매개변수를 유추할 수 없는 경우
	public static <K, V> V printInfo(K key) {
		V v = null;
		return v;
	}
}
