package chap01;
/*
 * 작성자 : 주은하
 * 작성일자 : 2022-05-18
 * 기능 : 숫자 계산기 
 */
public class 계산기 {
	public static void main(String[] args) {
		//두 수의 합을 출력
		//add();
		//두 수의 뺄셈
		//sub();
		//국어, 영어, 수학의 합계와 평균 출력
		totalAvg();
	}
	
	public static void totalAvg() {
		//국어 변수 선언
		int kor;
		//국어 변수 초기화
		kor = 60;
		//영어 변수 선언 + 초기화
		int eng = 95;
		//수학 변수 선언 + 초기화
		int mat = 92;
		//세 과목의 합의 계산을 변수에 담기
		int sum = kor+eng+mat;
		//합을 3으로 나누어서 평균을 구해서 변수에 담기
		double avg = (double)sum / 3;		//강제 형 변환
		//합계 출력
		System.out.println("합계=" + sum);
		//평균 출력
		System.out.println("평균=" + avg);
	}
	
	public static void add() {
		int num1 = 1;		//변수 NUM1을 선언하고 1을 저장
		int num2 = 2;		//변수 NUM2를 선언하고 2를 저장
		num1 = 10;			//변수에는 값을 바꿔서 저장할 수 있다.
		int result = num1 + num2; //변수 RESULT를 선언하고 X와 Y를 더한 값을 저장
		System.out.println(result); //모니터에 결과를 출력
	}
	
	public static void sub() {
		int x = 1;
		int y = 2;
		int result = x-y;
		System.out.println(result);
	}
	
}
