package ch17.sec10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import org.xml.sax.ext.Attributes2;

public class AggregateExample_1 {
	public static void main(String[] args) {

		int[] arr = new int[100];

		for (int i = 1; i <= 100; i++) {
			arr[i - 1] = i;
		}

		int s1 = 0, sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 != 0) {
				s1++;
				sum1 += arr[i];
			}

		}
		System.out.println("s1 = " + s1);
		System.out.println("sum1 = " + sum1);

		// 4의 배수의 첫번째 요소
		int first = Arrays.stream(arr)
				.filter(s -> s % 4 == 0)
				.findFirst()
				.getAsInt();
		System.out.println("4의 배수의 첫번째 요소 : " + first);

		// 3의 배수의 총합
		int sum3 = Arrays.stream(arr)
				.filter(s -> s % 3 == 0)
				.sum();
		System.out.println("3의 배수의 총합 : " + sum3);

		// 5의 배수가 아닌것의 평균
		double avg5 = Arrays.stream(arr)
				.filter(s -> s % 5 != 0)
				.average()
				.getAsDouble();
		System.out.println("5의 배수가 아닌것의 평균 : " + avg5);

		// 6의 배수의 갯수
		long count6 = Arrays.stream(arr)
				.filter(s -> s % 6 == 0)
				.count();
		System.out.println("6의 배수의 갯수 : " + count6);

		int[] arr2 = { 15, 44, 33, 48, 19, 7, 86, 74 };

		// arr2의 최대값
		int maxArr2 = Arrays.stream(arr2)
				.max()
				.getAsInt();
		System.out.println("arr2의 최대값 : " + maxArr2);
		// arr2의 최소값
		int minArr2 = Arrays.stream(arr)
				.min()
				.getAsInt();
		System.out.println("arr2의 최소값 : " + minArr2);

		// arr2의 오름차순 정렬
		Arrays.stream(arr2).sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
		// arr2의 내림차순 정렬 방법을 못찾겠네..;;
		Integer[] arr3 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
		Arrays.sort(arr3, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr3));
	}
}
