package ch17_1.sec07.exam03;

import java.util.*;

public class SortingExample {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("홍길동", 30));
		list.add(new Student("신용권", 10));
		list.add(new Student("유미선", 20));
		list.add(new Student("타노스", 50));
		list.add(new Student("감자바", 40));

		list.stream()
				.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();

	}
}
