package baekjoon.p10818;

import java.util.Scanner;
//최대 최소
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] array = new int[num];
		int min = array[0];
		int max = array[0];
	
		for (int i = 0; i < num; i++) {
			array[i] = scan.nextInt();
		}
			for (int k = 1; k < num; k++) {
				if (min > array[k]) {
					min = array[k];
			} else if (max < array[k]) {
					max = array[k];
			}
			System.out.printf("%d %d", min, max);
	}
}
}