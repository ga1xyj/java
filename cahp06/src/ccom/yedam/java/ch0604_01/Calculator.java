package ccom.yedam.java.ch0604_01;

public class Calculator {
	int[] numList; // 숫자 입력 받을 배열 선언
	int index;
	
	Calculator(){
		index=-1;
	}
	
	//1.갯수 입력
	void setArraySize(int size) {
		numList = new int[size]; // 배열 초기화
	}
	//2.숫자 입력
	void setNum(int num) {
		if((index+1) < numList.length) {
			numList[++index] = num;
		}else {
			System.out.println("숫자를 더 이상 입력할 수 없습니다.");
		}
	}
	//3.더하기
	void plus() {
		if(isExecuted()) { // 메소드도 충분히 가능
			int sum = 0;
			for(int i=0; i<= index; i++) {
			 sum += numList[i];
			} System.out.println("더한 결과 :" + sum);
		}
	}
	//4.빼기
	void minus() {
		if(isExecuted()) {
			int min = numList[0];
			for(int i=0; i<= index; i++) {
				min -= numList[i];
			} System.out.println("뺀 결과: " + min);
		}
	}
	//5.곱하기
	void multiplication() {
		if(isExecuted()) {
			int multi = numList[0];
			for(int i=1; i<= index; i++) { //배열[1]부터 접근해야 함
				multi *= numList[i];
		} System.out.println("곱한 결과: " + multi);
		}
	}
	//6.나누기
	void division() {
		if(isExecuted()) {
			double divi = numList[0];
			for(int i=1; i <= index; i++) { //배열[1]부터 접근해야 함
				divi /= (double)numList[i];
			} System.out.println("나눈 결과: " + divi);
		} 
	}
	
	//0.조건 체크
	boolean isExecuted() { // 배열의 값이 두 개 이상인 경우만 체크
		if((index+1)>=2) {
			return true;
		} else {
			System.out.println("숫자를 더 입력해주세요.");
			return false;
		}
	}
}
