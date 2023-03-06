package ch17_1.sec07.exam01;

import java.util.*;

public class SortingExample {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("홍길동", 20));
		list.add(new Student("감자바", 15));
		list.add(new Student("신용권", 40));

		list.stream().sorted().forEach(n -> System.out.println(n.getName() + "=" + n.getScore()));
		System.out.println();
		
		
		list.stream().sorted(Comparator.reverseOrder())
				.forEach(n -> System.out.println(n.getName() + "=" + n.getScore()));
	}
}
