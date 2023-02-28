package ch17_2.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("감자바", 20),
				new Student("신용권", 30),
				new Student("타노스", 40));

		// 방법1
		// 스트림 생성
		Stream<Student> studentStream = list.stream();
		// 중간 처리(학생 객체를 점수로 맵핑)
		IntStream intStream = studentStream.mapToInt(student -> student.getScore());
		// 최종 처리(평균 점수)
		double result = intStream.average().getAsDouble();
		System.out.println("result : " + result);
		System.out.println();

		// 방법2
		double avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		System.out.println("result : " + avg);
	}
}
