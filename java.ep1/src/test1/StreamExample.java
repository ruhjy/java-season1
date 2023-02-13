package test1;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {

		Stream<String> strStream = Stream.of("a", "b", "c", "d", "e", "f");
//		System.out.println(strStream);
		Set<String> set = strStream.collect(Collectors.toSet());
		
//		System.out.println(set);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}
		
//		for(String string : set) {
//			System.out.println(string);
//		}
	}
}
