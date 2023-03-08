package data_structure.chapter01;

import java.util.stream.*;

public class Practice01_2 {
	public static void main(String[] args) {

		int max = maxValue(20, 31, 15, 31, 7);
		System.out.println("최댓값 : " + max);
	}

	private static int maxValue(int data1, int data2, int data3, int data4, int data5) {

		return IntStream.of(data1, data2, data3, data4, data5)
				.max().getAsInt();

	}
}
