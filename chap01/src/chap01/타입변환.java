package chap01;
/*
 * 데이터타입을 다른 타입으로 변환
 * 강제형변환
 * 자동형변환
 * 
 * String <-> 기본데이터형 (int, double, ...)
 *
 */

public class 타입변환 {

	public static void main(String[] args) {
		//자동
		int a = 100;
		long b = a;

		//강제
		long c = 100;
		int d = (int)c;
		
		//자동
		double e = c;
		
		//강제
		double f = 5.2;
		long g = (long)f;
		System.out.println("g= " + g);
		
		double h = 10 / 3.0;		//10 또는 3을 double로 강제형변환 or 3을 3.0으로 표현
		System.out.println("h= " + h);
		
		System.out.println("결과는=" + (10 + 20));
		System.out.println(10+20+" = 결과 ");
	
	
		// int -> String
		int i = 100;
		// String j = i; (x)
		String j = String.valueOf(i);
		
		// String -> int
		String k = "100";
		// int l = k; (x)
		int l = Integer.parseInt(k);
		// double l = double.parseDouble(k);
		// short l = short.parseShort(k);
		

		
	}

}
