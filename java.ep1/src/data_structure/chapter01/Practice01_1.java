package data_structure.chapter01;

import java.util.stream.*;

public class Practice01_1 {
	public static void main(String[] args) {

		int min = minValue(5, 9, 2, 13);
		System.out.println("최솟값 : " + min);
	}

	private static int minValue(int data1, int data2, int data3, int data4) {

		return IntStream.of(data1, data2, data3, data4)
				.min().getAsInt();

	}
}
