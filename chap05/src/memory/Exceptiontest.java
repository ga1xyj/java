package memory;

public class Exceptiontest {

	public static void main(String[] args) {

		int[] a = new int[5];
		System.out.println(a[0]);
		//System.out.println(a[5]);
	
		int[] b = null; // null 체크
			if(b != null) {
				System.out.println(b[0]);
			}

	}

}
