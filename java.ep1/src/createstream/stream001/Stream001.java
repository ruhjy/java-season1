package createstream.stream001;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream001 {
	public static void main(String[] args) {

		IntStream intStream = IntStream.rangeClosed(1, 100);
		int[] arr = intStream.filter(i -> i % 2 == 0).toArray();
		System.out.println(Arrays.toString(arr));

		IntStream intStream2 = Arrays.stream(arr);
		long count = intStream2.count();
		System.out.println("count : " + count);

		IntStream intStream3 = Arrays.stream(arr);
		int sum = intStream3.sum();
		System.out.println("sum : " + sum);

		IntStream intStream4 = Arrays.stream(arr);
		double avg = intStream4.average().getAsDouble();
		System.out.println("avg : " + avg);

	}
}
