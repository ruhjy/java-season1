package ch17_2.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	public static int sum;
	
	public static void main(String[] args) {
		// IntStream 생성
		IntStream intStream = IntStream.rangeClosed(1, 100); // 1~100까지의 정수
		int result = intStream.sum();
		System.out.println("1~100까지의 총합 : " + result);
		System.out.println();
		
		// IntStream 생성
		IntStream intStream2 = IntStream.rangeClosed(1, 100);
		intStream2.forEach(i -> sum += i);
		System.out.println("1~100까지의 총합 : " + sum);
	}
}
