package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		// NoSuchElementException 예외 발생
//		double avg = list.stream()
//				.mapToInt(Integer::intValue)
//				.average()
//				.getAsDouble();

		list.add(5);
		list.add(10);
		// 방법1
		OptionalDouble optional = list.stream()
				.mapToInt(Integer::intValue)
				.average();
		if (optional.isPresent()) {
			System.out.println("방법1_평균 : " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균 : 0.0");
		}

		// 방법2
		double avg = list.stream()
				.mapToInt(() -> {
					return Integer.intValue();
				})
				.average()
				.orElse(0.0);
		System.out.println("방법2_평균 : " + avg);

		// 방법3
		list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.ifPresent((i) -> System.out.println("방법3_평균 : " + i));
	}
}
