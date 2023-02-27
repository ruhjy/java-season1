package test1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동", "김삿갓", "이몽룡", "성춘향");
		System.out.println("외부 반복자 사용");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n");

		System.out.println("내부 반복자 사용");
//		Stream.of(list).forEach(n -> System.out.print(n + " "));
		Stream<String> strStream = list.stream();
		strStream.forEach(n -> System.out.print(n + " "));

		System.out.println("\n");

		System.out.println("다시 출력");
		list.stream().forEach(n -> System.out.print(n + " "));
	}
}
