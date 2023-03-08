package ch17_2.sec10;

import java.util.*;
import java.util.stream.*;

public class AggregateExample {
	public static void main(String[] args) {

		int[] arr = IntStream.rangeClosed(1, 100).toArray();

		long count = Arrays.stream(arr)
				.filter(n -> n <= 50)
				.count();
		System.out.println("50 이하 개수 : " + count);

	}

}
