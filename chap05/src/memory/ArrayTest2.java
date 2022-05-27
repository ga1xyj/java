package memory;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		String[] arr = {"hello", "hi", "good"};
		for(int i=0; i<arr.length; i++) {
			//배열의 값을 모두 출력
			System.out.println(arr[i]);
			System.out.println(arr[i].length()); // 배열의 크기를 알고 싶을 때 - 속성
		}
		
		
	}

}
