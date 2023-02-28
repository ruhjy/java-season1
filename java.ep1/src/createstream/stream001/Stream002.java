package createstream.stream001;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream002 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("java", "html", "css", "javascript", "jsp", "jquery", "spring");

		Stream<String> strStream = list.stream();
		strStream.map(String::length).sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String> strStream2 = list.stream();
		int count = (int)strStream2.sorted().count();
		System.out.println("count : " + count);
		
		Stream<String> strStream3 = list.stream();
		strStream3.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		Stream<String> strStream4 = list.stream();
		Stream<String> strStream5 = list.stream();
		strStream4.sorted((o1, o2) -> o1.compareTo(o2)).forEach(s -> System.out.print(s + " "));
		System.out.println();
		strStream5.sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		Stream<String> strStream6 = list.stream();
		strStream6.filter(s -> s.length() > 5).sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		Stream<String> strStream7 = list.stream();
		strStream7.sorted(Comparator.comparing(String::length)).forEach(s -> System.out.print(s + " "));
	}
}
