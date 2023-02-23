package ch17_1.sec04.exam03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class StreamExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100); // 1~100까지의 수
//		IntStream stream = IntStream.range(1, 101); // 1~100까지의 수

//		stream.forEach(a -> sum += a);
		sum = stream.sum();
		System.out.println(sum);

//		Iterator<Integer> it = stream.iterator();
//		
//		while(it.hasNext()) {
//			System.out.print(it.next() + ", ");
//		}

	}
}
