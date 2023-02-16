package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);

		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.println("총합: " + total);
	}
}
