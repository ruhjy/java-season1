package ch15.sec03.exam03_1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("html");
		set.add("css");
		set.add("javascript");
		set.add("jquery");
		set.add("java");
		set.add("spring");
		set.add("javascript");
		set.add("jsp");
		set.add("sql");
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("html") || element.equals("css")) {
				iterator.remove();
			}
		}
		System.out.println();
		System.out.println(set.size());
		
		for(String e : set) {
			System.out.println(e);
		}
		
	}
}
