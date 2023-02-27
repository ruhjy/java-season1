package jungsuk.problem.ch06;

import java.util.Arrays;

public class Problem17 {

	public static int[] shuffle(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 9);
			int tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));

	}
}