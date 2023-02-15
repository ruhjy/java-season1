package ch15_1.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<String> set = new HashSet<>();
		
		// 객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		set.add("Spring");
		
		// 저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}
	}
}
