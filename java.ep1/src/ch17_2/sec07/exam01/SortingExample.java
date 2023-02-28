package ch17_2.sec07.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("감자바", 10));
		studentList.add(new Student("타노스", 20));
		studentList.add(new Student("신용권", 50));
		studentList.add(new Student("유미선", 40));

		// 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
				.sorted()
				.forEach(s -> System.out.println(s.getName() + " : "
						+ s.getScore()));
		System.out.println();

		// 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(s -> System.out.println(s.getName() + " : "
						+ s.getScore()));
		
		String[] str2 = studentList.stream().map(s->s.getName()).toArray(String[]::new);
		System.out.println(Arrays.toString(str2));

	}
}
