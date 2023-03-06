package ch17_1.sec10;

import java.util.*;

public class OptionalExample {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(50);
		list.add(40);
		list.add(80);
		
//		double avg = list.stream()
//				.mapToInt(Integer::intValue)
//				.average()
//				.getAsDouble();
//		System.out.println("avg : " + avg);
		
		// 방법1
		OptionalDouble optional = list.stream()
				.mapToInt(Integer::intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균 : " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균 : 0.0");
		}
		
		
		// 방법2
		double avg = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2_평균 : " + avg);
		
		// 방법3
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균 : " + a));
	}
}
