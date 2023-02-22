package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {

		// 정수 배열
		int[] arr = { 1, 2, 3, 4, 5 };

		// 카운팅
		long count = Arrays.stream(arr)
				.filter(a -> a % 2 == 0)
				.count();
		System.out.println("2의 배수 개수 : " + count);

		// 총합
		long sum = Arrays.stream(arr)
				.filter(a -> a % 2 == 0)
				.sum();
		System.out.println("2의 배수의 합 : " + sum);

		// 평균
		double avg = Arrays.stream(arr)
				.filter(a -> a % 2 == 0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수의 평균 : " + avg);
		
		// 최대값
		int max = Arrays.stream(arr)
				.max()
				.getAsInt();
		System.out.println("배열의 최대값 : " + max);
		
		// 최소값
		int min = Arrays.stream(arr)
				.min()
				.getAsInt();
		System.out.println("배열의 최소값 : " + min);
		
		// 첫번째 요소
		int first = Arrays.stream(arr)
				.findFirst()
				.getAsInt();
		System.out.println("배열의 첫번째 요소 : " + first);
		
		
	}
}
