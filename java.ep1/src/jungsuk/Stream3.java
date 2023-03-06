package jungsuk;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream3 {
	public static void main(String[] args) {

		Stream emptyStream = Stream.empty();
		long count = emptyStream.count();
		System.out.println("emptyStream.count = " + count);
		System.out.println();
		
		String[] strArr = { "dd", "aaa", "CC", "cc", "b", "aaa" };
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b", "aaa");
		strStream.distinct().limit(6).sorted().forEach(i -> System.out.print(i + " "));
		System.out.println("\n");

		IntStream intStream = IntStream.rangeClosed(1, 10); // 1~10까지의 정수 스트림
		intStream.skip(3).limit(5).forEach(i -> System.out.print(i + " ")); // 3개 건너띄고 5개만 출력
		System.out.println("\n"); // 1 2 3 | ( 4 5 6 7 8 ) 9 10

		IntStream intStream2 = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
		intStream2.distinct().forEach(i -> System.out.print(i + " ")); // 중복 제거
		System.out.println("\n");

		IntStream intStream3 = IntStream.rangeClosed(1, 10);
		intStream3.filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " ")); // 2의 배수만 출력
		System.out.println("\n");

		IntStream intStream4 = IntStream.rangeClosed(1, 10);
//		intStream4.filter(i -> i % 2 != 0 && i % 3 != 0).forEach(System.out::println);
		// 2의 배수도 아니고 3의 배수도 아닌 것을 출력
		intStream4.filter(i -> i % 2 != 0).filter(i -> i % 3 != 0).forEach(System.out::println);
	}
}
