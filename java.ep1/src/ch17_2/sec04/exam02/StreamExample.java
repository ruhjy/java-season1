package ch17_2.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		// String 배열 생성
		String[] strArr = { "홍길동", "도깨비", "백승수" };

		// 스트림 생성
		Stream<String> strStream = Arrays.stream(strArr);

		strStream.forEach(s -> System.out.println(s));
		System.out.println();

		// int 배열 생성
		int[] intArr = { 6, 4, 2, 21, 3, 6, 1, 51, 4 };

		// 스트림 생성
		IntStream intStream = Arrays.stream(intArr);
		// 중간 처리 - 중복제거, 정렬
		IntStream intStream2 = intStream.distinct().sorted();
		// 최종 처리 - 출력
		intStream2.forEach(i -> System.out.println(i));
	}
}
