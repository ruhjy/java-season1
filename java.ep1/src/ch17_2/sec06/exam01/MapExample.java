package ch17_2.sec06.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 82));
		list.add(new Student("신용권", 90));
		list.add(new Student("감자바", 91));

		// Student를 score 스트림으로 변환
//		list.stream().mapToInt(Student::getScore).forEach(System.out::println);
		list.stream().mapToInt(s -> s.getScore()).forEach(n -> System.out.print(n + " "));
		System.out.println();

//		int sum = list.stream().mapToInt(s -> s.getScore()).sum();
//		System.out.println("점수 총합 : " + sum);
//		long count = list.stream().mapToDouble(s -> s.getScore()).count();
//		System.out.println("count : " + count);
//		double avg1 = list.stream().mapToInt(s -> s.getScore()).average().getAsDouble();
//		double avg2 = list.stream().mapToDouble(s -> s.getScore()).average().getAsDouble();
//		System.out.println("점수 평균 : " + avg1);
//		System.out.println("점수 평균 : " + avg2);

	}
}
