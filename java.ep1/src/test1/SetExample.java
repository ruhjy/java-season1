package test1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SetExample {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(1);
		set.add(new Integer(1));
		set.add(2);
//		set.add("3");
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}
		
	}
}
