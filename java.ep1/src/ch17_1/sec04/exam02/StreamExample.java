package ch17_1.sec04.exam02;

import java.util.Arrays;
import java.util.jar.Attributes.Name;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		String[] strArr = { "홍길동", "신용권", "김미나" };
//		Stream<String> strStream = Arrays.stream(strArr);
		Stream<String> strStream = Stream.of(strArr);
		strStream.forEach(name -> System.out.print(name + ", "));
		System.out.println();

		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		IntStream intStream = IntStream.of(intArr);
//		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(num -> System.out.print(num + ", "));

	}
}
