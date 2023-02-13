package ch15.sec03.exam02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("루피", 22));
		set.add(new Member("조로", 25));
		set.add(new Member("홍길동", 29));
		set.add(new Member("홍길동", 30));
		
		Iterator<Member> it = set.iterator();
		
		while(it.hasNext()) {
			Member m = it.next();
			System.out.println(m);
		}
		System.out.println();
		System.out.println("총 객체 수 : " + set.size());
	}
}
