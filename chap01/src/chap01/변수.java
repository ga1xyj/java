package chap01;
/*
 *  변수의 타입(유형) :
 *  		변수 -> 메모리의 저장 위치
 *  		유형 -> 메모리에 값을 저장하는 형식(구조와 크기가 다름)
 *  
 *  		 1		2		4		8
 *  숫자	정수	byte < short < int < long < BigDecimal
 *  		127	  3만2천	  6만5천	 10^18
 *  
 *  			7     15
 *  	실수 float < double 유효자릿수 정밀도(10^-n)
 *  문자 한글자  char	<- 'a' '가'
 *  	단어	  String <- "홍길동"
 *  	
 *  불린형 boolean <- true, false
 *  날짜
 */
public class 변수 {

	public static void main(String[] args) {
		int int2 = 0b1111111; // 2진수 : 0b로 시작
		int int8 = 017; // 8진수 : 0으로 시작
		int int16 = 0x7F; // 16진수 : 0x로 시작

		int korScore = 128;			// 상수값의 기본형은 int
		long rich = 2200000000l;	// 상수값 long 사용하려면 접미어 L or l
		float avg = 0.123456789f;	// float형 변수 avg를 선언하고 상수값 84.5를 변수에 저장
		double totalAvg = 0.123456789012345678;
		
		System.out.println("int2= \n\t\t \\" + int2 + "\\"); // 이스케이프 문자
		System.out.println("int8= \" " +int8+ " \""); // ""
		System.out.println("int16= " + int16);
		
		boolean passYn = true;
		
		int k = 60, e = 60, m = 60;
		boolean fail = k>50 && e>50 && m>50;		
		System.out.println("fail = " + fail);
		
		int engScore = 10;			// 변수 선언, 초기화
		int mathScore;				// 변수 선언
		mathScore = 100;			// 초기화
		
		System.out.println(avg);
		System.out.println(totalAvg);
		System.out.println(engScore);
	
		char grade = '가'; //67;	//'A';	// 문자는 작은 따옴표
		String grade2 = "A+";			// 문자열은 큰 따옴표로 표현
		
		System.out.println("grade = " + (int)grade);
		
		char code = 44033;
		System.out.println("44033 문자 = " + code);
	}

}
