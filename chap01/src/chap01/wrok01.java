package chap01;

public class wrok01 {

	public static void main(String[] args) {
		변수선언();
	}
	
	public static void 변수선언() {
		char grade = '상';
		String schoolName = "예담";
		int score = 85;
		double average = 4.235;
		int flag = 0b10000000;
		char firstChar = '\uAC00';
		char secondChar = 0xAC01;
		int salary = 1_000_000; // 읽기 편하게 _ 넣어준다
		boolean useYn = true;
		
		System.out.print("grade=\'" + grade + "\'"); // print 출력만
		System.out.print("schoolName=" + schoolName + "\n");
		System.out.println("score=" + score); // println 자동줄바꿈 출력
		System.out.print("average=" + average);
		System.out.print("flag=" + flag);
		System.out.print("firstChar=" + firstChar);
		System.out.print("secondChar=" + secondChar);
		System.out.print("salary=" + salary);
		System.out.print("useYn=" + useYn);
		
	}

}
