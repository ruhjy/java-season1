package ch17_1.sec11;

import java.util.*;

public class ReductionExample {
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 60),
				new Student("신용권", 90),
				new Student("감자바", 50),
				new Student("타노스", 70));
		
		// 방법1
		int sum1 = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		System.out.println("sum1 : " + sum1);
		
		// 방법2
		int sum2 = studentList.stream()
				.map(Student::getScore)
				.reduce(0, (a, b) -> a + b);
		System.out.println("sum2 : " + sum2);
		
		
	}
}
