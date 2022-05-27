package chap01;

import java.io.IOException;

public class 입출력 {

	public static void main(String[] args) throws IOException {
		String korName = "국어";
		String engName = "영어";
		
		int kor = System.in.read(); // 키보드 입력
		int eng = System.in.read();
		double avg = (kor + eng) / 2.0;
		
		// System.out.println("국어는=" + kor + " 영어는=" + eng);
		// 형식문자열, 남으면 괜찮지만 모자라면 error
		System.out.printf("%s는=%d\n%s는=%d\n평균은=%4.1f", korName, kor, engName, eng, avg); 

}
	
}