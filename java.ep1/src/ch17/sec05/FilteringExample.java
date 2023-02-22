package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {

		// List 생성
		List<String> list = new ArrayList<>();
		
		
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권");
		list.add("신민철");

		// 중복 요소 제거 distinct() -> 출력
		list.stream().distinct().forEach((i) -> System.out.println(i));
		System.out.println();
		
		// "신"으로 시작하는 요소만 필터링 -> 출력
		list.stream().filter(n -> n.startsWith("신"))
//					.forEach(System.out::println);
					.forEach(n -> System.out.println(n));
		System.out.println();
		
		// 중복 요소 제거 -> "신"으로 시작하는 요소만 필터링 -> 출력
		list.stream().distinct().filter(n -> n.startsWith("신"))
					.forEach(n -> System.out.println(n));
		
		
	}
}
