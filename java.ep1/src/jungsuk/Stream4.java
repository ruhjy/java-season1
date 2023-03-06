package jungsuk;

import java.util.Comparator;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream4 {
	public static void main(String[] args) {
		Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
//		strStream.sorted().forEach(System.out::print);
//		strStream.sorted(Comparator.reverseOrder()).forEach(System.out::print);
//		strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(System.out::print);
		strStream.sorted(Comparator.comparing(String::length)).forEach(System.out::print);
		System.out.println("\n");
		
		IntStream is = new Random().ints(5);
		is.forEach(System.out::println);
		System.out.println();
		
		IntStream is1 = new Random().ints(1,46);
		is1.distinct().limit(6).sorted().forEach(System.out::println);
		
//		Optional<String> optVal = Optional.of(null);
//		String str1 = optVal.get();
//		String str2 = optVal.orElse("");
		
//		System.out.println(str1);
//		System.out.println(str2);
	}
}
