package ch17_1.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("홍길동", 85));
		list.add(new Student("홍길동", 92));
		list.add(new Student("홍길동", 87));
		list.add(new Student("홍길동", 88));
		list.add(new Student("홍길동", 90));
		list.add(new Student("홍길동", 98));
		list.add(new Student("홍길동", 100));
		list.add(new Student("홍길동", 92));
		list.add(new Student("홍길동", 95));
		list.add(new Student("홍길동", 84));
		list.add(new Student("홍길동", 70));
		list.add(new Student("홍길동", 50));

		list.stream()
				.mapToInt(Student::getScore) // mapToInt(s -> s.getScore())
//				.sorted()
				.filter(s -> s >= 90)
				.forEach(s -> System.out.print(s + " "));
	}
}
