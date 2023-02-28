package ch17_2.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
	public static void main(String[] args) {
		// int 배열 생성
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 스트림 생성
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream()
				.forEach(n -> System.out.print(n + ", "));
		System.out.println();

		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(n -> System.out.print(n.intValue() + ", "));
		System.out.println();

		intStream = Arrays.stream(intArray);
		boolean b1 = intStream.allMatch(i -> i % 1 == 0);
		System.out.println(b1);

	}
}
