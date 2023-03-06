package jungsuk;

import java.util.*;
import java.util.stream.*;

public class Stream1 {
	public static void main(String[] args) {

		String[] strArr = { "aaa", "ddd", "ccc" };
		List<String> strList = Arrays.asList(strArr);
		System.out.println(strList);
		System.out.println();

		Stream<String> strStream1 = strList.stream(); // 스트림 생성
		Stream<String> strStream2 = Arrays.stream(strArr); // 스트림 생성

//		strStream1.sorted().forEach(System.out::println);
//		strStream2.sorted().forEach(System.out::println);

		int sum = strStream1.parallel().mapToInt(s -> s.length()).sum();
		System.out.println(sum);
		System.out.println();

		Set<String> collectToset = strStream2.collect(Collectors.toSet());

		Iterator<String> iterator = collectToset.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("setIterator = " + str);
		}
		System.out.println();

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream = list.stream();
		intStream.forEach(System.out::println);
		System.out.println();

		Stream<String> strStream3 = Stream.of("a", "b", "c");
		Stream<String> strStream4 = Stream.of(new String[] { "a", "b" });
		Stream<String> strStream5 = Arrays.stream(new String[] { "a", "b", "c" });

		IntStream intStream6 = IntStream.of(1, 2, 3, 4, 5, 6);
		intStream6.forEach(System.out::println);

	}
}
