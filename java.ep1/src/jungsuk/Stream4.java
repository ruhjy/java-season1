package jungsuk;

import java.util.Comparator;
import java.util.stream.Stream;

public class Stream4 {
	public static void main(String[] args) {
		Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
//		strStream.sorted().forEach(System.out::print);
//		strStream.sorted(Comparator.reverseOrder()).forEach(System.out::print);
//		strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(System.out::print);
		strStream.sorted(Comparator.comparing(String::length)).forEach(System.out::print);
	}
}
