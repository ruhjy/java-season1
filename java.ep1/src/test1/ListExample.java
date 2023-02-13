package test1;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample {
	public static void main(String[] args) {

		int[] intArr = { 45, 50, 15, 78, 22, 456, 11, 95, 61 };
		
		List<Integer> list = Arrays.stream(intArr)
				.boxed()
				.sorted()
				.collect(Collectors.toList());

		System.out.println(list);
//		List<String> list = new ArrayList<>();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("1");
//
//		Iterator<String> it = list.iterator();
//
//		while (it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
//		System.out.println();
//		for (int i = 0; i < list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
//		System.out.println();
//
////		list.removeAll(list);
//		list.clear();
//		System.out.println(list);

	}
}
