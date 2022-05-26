package come.yedam.java.ch0604;
//1.학생 수 입력
//2.점수 입력
//3.점수 리스트 출력
//4.분석 - 최고점수, 평균점수
//5.종료 
public class Program {
	//필드
	int[] scores;
	int index;
	//생성자
	Program() {
		index = -1; // index로의 역할을 못한다
	}
	//메소드
	//1.학생수 입력
	void setStudentNum(int student) {
		scores = new int[student];
	}
	//2. 학생 점수 입력
	void setStudentScore(int score) {
		scores[++index] = score; // ++:먼저 값을 시키고 증가시킨 값을 사용한다
	}
	//3.점수리스트 출력
	void printScores() {
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]>"+scores[i]);
		}
	}
	//4.분석
	int getMax() {
		int max = scores[0];
		for(int i=0; i<scores.length; i++) { // 배열의 모든 값 가져오기 
			if(max < scores[i]) { // 내 값보다 크면
			   max = scores[i]; // 바꿔주기 
			}
		} return max;
		  //System.out.println("최고 점수: " + max);
	}
	
	double getAvg() {
		int sum = 0;
		double avg = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i]; // sum = sum + scores[i];
		}   //avg = sum/scores.length;
			//System.out.println("평균 점수: " + avg);
		return (double)sum / scores.length; //return식도 연산 가능 but int값으로 계산됨
	}
	
	void printResult() {
		System.out.println("최고 점수: " + getMax());
		System.out.println("평균: " + getAvg());
	}
	
	
	
}
