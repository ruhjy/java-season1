package createstream.stream001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream004 {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("가나", 20));
		list.add(new Student("다라", 30));
		list.add(new Student("마바", 40));

		Set<String> set2 = list.stream().map(Student::getName)
				.collect(Collectors.toSet());

		for (String s : set2) {
			System.out.println(s);
		}
		System.out.println();

		Iterator it = set2.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		System.out.println();
		
		Iterator<String> it2 = set2.iterator();
		while (it2.hasNext()) {
			String string = it2.next();
			System.out.println(string);
		}
	}
}
