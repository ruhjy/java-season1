package jungsuk;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream3 {
	public static void main(String[] args) {

		Stream emptyStream = Stream.empty();
		long count = emptyStream.count();
//		System.out.println(count);

		String[] strArr = { "dd", "aaa", "CC", "cc", "b", "aaa" };
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b", "aaa");
		strStream.distinct().limit(6).sorted().forEach(System.out::println);

		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.skip(3).limit(5).forEach(System.out::println);
		System.out.println();

		IntStream intStream2 = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
		intStream2.distinct().forEach(System.out::println);
		System.out.println();

		IntStream intStream3 = IntStream.rangeClosed(1, 10);
		intStream3.filter(i -> i % 2 == 0).forEach(System.out::println);
		System.out.println();

		IntStream intStream4 = IntStream.rangeClosed(1, 10);
//		intStream4.filter(i -> i % 2 != 0 && i % 3 != 0).forEach(System.out::println);
		intStream4.filter(i -> i % 2 != 0).filter(i -> i % 3 != 0).forEach(System.out::println);
	}
}
