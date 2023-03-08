package data_structure.chapter02.array;

import java.util.*;

public class Chapter3_loop_3 {
	public static void main(String[] args) {

		Random random = new Random();
		final int ARRAY_LENGTH = 100;

		int[] arr = new int[ARRAY_LENGTH];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));

		int min = 0;
		int max = 0;

		for (int k : arr) {
			if (min > k) {
				min = k;
			} else if (max < k) {
				max = k;
			}
		}

		System.out.println("최솟값 : " + min);
		System.out.println("최댓값 : " + max);
	}
}
