package ch17_1.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30));

		// 방법1
		// 스트림 생성
		Stream<Student> studentStream = list.stream();
		// 중간 처리(학생 객체를 점수로 매핑)
//		Stream<Integer> scoreStream = studentStream.map(stduent -> student.getScore());
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		// 최종 처리(평균 점수)
		double avg = scoreStream.average().getAsDouble();
		// 출력
		System.out.println("평균 : " + avg);

		// 방법2
		double avg2 = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();

		System.out.println("평균 : " + avg2);
	}
}
