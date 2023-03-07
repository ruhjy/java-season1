package ch17_1.sec06.exam01;

import java.util.*;
import java.util.stream.*;

public class MapExample01 {
	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5 };

		IntStream intStream = Arrays.stream(intArray);

		intStream
				.asDoubleStream()
				.forEach(System.out::println);
		System.out.println();
		
		intStream = Arrays.stream(intArray);

		intStream
				.boxed() // int -> Integer 변환??
				.forEach(obj -> System.out.println(obj.intValue()));
	}
}
