package ch17_1.sec07.exam02;

import java.util.*;

public class SortingExample {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("홍길동", 40));
		list.add(new Student("신용권", 15));
		list.add(new Student("타노스", 23));
		list.add(new Student("감자바", 36));
		list.add(new Student("도깨비", 7));

		list.stream().sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
				.forEach(s -> System.out.println(s.getName() + "=" + s.getScore()));
		System.out.println();

		list.stream().sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
				.forEach(s -> System.out.println(s.getName() + "=" + s.getScore()));
	}
}
