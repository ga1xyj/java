package com.yedam.java.ch1101;
//개발자의 편의에 의해서
import java.util.HashMap;
import java.util.Map;
//동일하다고 인식시킴
//String은 안됨(new 연산자를 쓰면 동일하다고 해도 다른 값으로 인식시킴)
public class KeyTest {

	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<Key, String>();
		
		map.put(new Key(1), "홍길동");
		
		String value = map.get(new Key(1));
		System.out.println(value);
	}

}
