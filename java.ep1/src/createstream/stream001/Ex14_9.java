package createstream.stream001;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_9 {
	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum",
//				""
		};

		Stream.of(strArr).forEach(System.out::println);

		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
		Optional<String> sWord = Stream.of(strArr)
				.filter(s -> s.charAt(0) == 's').findFirst();
		System.out.println("noEmptyStr : " + noEmptyStr);
		System.out.println("sWord : " + sWord.get());

		// Stream<String>을 IntStream으로 변환
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream5 = Stream.of(strArr).mapToInt(String::length);

		int count1 = (int) intStream1.count();
		int count2 = intStream2.reduce(0, (a, b) -> a + 1);
		int sum = intStream3.reduce(0, (a, b) -> a + b);

		OptionalInt max = intStream4.reduce(Integer::max);
		OptionalInt min = intStream5.reduce((a, b) -> Integer.min(a, b));
//		OptionalInt min = intStream5.reduce(Integer::min);
		System.out.println("count1 : " + count1);
		System.out.println("count2 : " + count2);
		System.out.println("sum : " + sum);
		System.out.println("max : " + max.getAsInt());
		System.out.println("min : " + min.getAsInt());
		
	}
}
