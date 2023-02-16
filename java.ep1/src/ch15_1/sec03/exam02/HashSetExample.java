package ch15_1.sec03.exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class HashSetExample {
	public static void main(String[] args) {

		// HashSet 컬렉션 생성
		Set<Member> set = new HashSet<>();

		// Member 객체 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동2", 30));
		set.add(new Member("홍길동3", 30));
		set.add(new Member("홍길동54", 30));
		set.add(new Member("홍길동6", 30));
		set.add(new Member("홍길동7", 30));
		set.add(new Member("홍길동8", 30));
		set.add(new Member("홍길동056", 30));

		System.out.println("총 객체 수 : " + set.size());
		
		Stream<Member> mStream = set.stream();
		mStream.sorted().forEach(System.out::println);
		
		
//		for(Member b : set) {
//			System.out.println(b);
//		}
		
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

	}
}
