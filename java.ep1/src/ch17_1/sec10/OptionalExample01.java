package ch17_1.sec10;

import java.util.*;

public class OptionalExample01 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
//		list.add(100);
//		list.add(50);
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer::intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println(optional.getAsDouble());
		} else {
			System.out.println(-1);
		}
		
		double avg = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		System.out.println(avg);
		
		list.stream().mapToInt(Integer::intValue)
			.average().ifPresent(i -> System.out.println(i));
	}
}
