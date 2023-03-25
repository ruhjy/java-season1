package createstream.stream001;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class Stream005 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 42);
		map.put("B", 23);
		map.put("C", 22);
		map.put("D", 19);

		int sum = 0;
		for (int s : map.values()) {
			sum += s;
		}
		System.out.println("총합 : " + sum);

		double avg = (double) sum / map.size();
		System.out.println("평균 : " + avg);
		System.out.println();

		int sum2 = map.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println("총합 : " + sum2);
		double avg2 = (double) sum / map.size();
		System.out.println("평균 : " + avg2);
		System.out.println();

		double avg3 = map.values().stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println("avg3 : " + avg3);

//		int sum4 = map.values().stream().mapToInt(Integer::intValue).sum();
//		int sum4 = map.values().stream().mapToInt(item -> item.intValue()).sum();
		int sum4 = map.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum4 : " + sum4);
		double avg4 = sum4 / map.size();
		System.out.println("avg4 : " + avg4);

		int sum5 = map.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum5 : " + sum5);
//		OptionalDouble avg5 = map.values().stream().mapToDouble(Integer::intValue).average();
		double avg5 = map.values().stream().mapToDouble(Integer::intValue).average().getAsDouble();
//		System.out.println("avg5 : " + avg5.getAsDouble());
		System.out.println("avg5 : " + avg5);
	}
}
