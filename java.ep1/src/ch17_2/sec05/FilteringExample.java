package ch17_2.sec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilteringExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("타노스");
		list.add("신용권");
		list.add("신민철");
		// 전체 출력
		list.stream().forEach(n -> System.out.print(n + " "));
		System.out.println();
		// 중복 요소 제거
		list.stream().distinct().forEach(n -> System.out.print(n + " "));
		System.out.println();
		// 신으로 시작하는 요소만 필터링
		list.stream().filter(n -> n.startsWith("신")).forEach(n -> System.out.print(n + " "));
		System.out.println();
		// 중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
		list.stream().distinct()
				.filter(n -> n.startsWith("신")).forEach(n -> System.out.print(n + " "));
		
		
//		int[] intArr1 = {1,6,4,2,8,9,4,3,1};
//		int[] intArr2 = {13,63,23,88,44,21,53,13};
//		
//		Stream<int[]> intStream = Stream.of(intArr1, intArr2);
//		intStream.flatMap();
	}
}
