package jungsuk;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {
	public static void main(String[] args) {
		
//		IntStream intStream = new Random().ints();	// 무한 스트림
//		intStream.limit(10).forEach(System.out::println);
//		System.out.println("------------------------------");
//		
//		IntStream intStream2 = new Random().ints(10);
//		intStream2.forEach(System.out::println);
		
//		IntStream intStream3 = IntStream.range(1, 47); // 1~46
//		intStream3.forEach(System.out::println);
		
		
//		ints(int begin, int end) begin <= x < end
		IntStream intStream3 = new Random().ints(1, 47);
		intStream3.limit(6).sorted().forEach(System.out::println);
		System.out.println("------------------------------");

		IntStream intStream4 = new Random().ints(6, 1, 47);
		intStream4.sorted().forEach(System.out::println);
		System.out.println();
		
		Stream<Integer> intStream5 = Stream.iterate(0, n -> n + 2);
		intStream5.limit(100).forEach(System.out::println);
//		무한 스트림이라서 count 값 출력하려니까 에러난듯??
//		long count = intStream5.count();
//		System.out.println("intStream5의 count() : " + count);
	}
}
