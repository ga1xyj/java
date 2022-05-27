package memory;

public class EqualTest {

	public static void main(String[] args) {

		int[] a = new int[5]; // 배열은 0으로 초기화 됨
		int[] b = a;		  // 얕은 복사(주소만 복사)
		int[] c = new int[a.length]; // length:배열의 크기를 알려줌 
		System.arraycopy(a, 0, c, 0, a.length); // 깊은 복사
		
		b[0] = 100;
		
		System.out.println(a[0]);
		System.out.println(a == b);

		//스트링
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2); // 객체 끼리는 다르다
		System.out.println(s1.equals(s2)); // 값 비교하면 똑같다
		
		String s3 = "hi";
		String s4 = "hi";
		System.out.println(s3 == s4); // 같은 객체를 참조하게 됨
	
		s1 = null;
		s2 = null;
	}

}
