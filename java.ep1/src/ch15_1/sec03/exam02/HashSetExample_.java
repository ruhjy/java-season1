package ch15_1.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample_ {
	public static void main(String[] args) {
		
		Set<Member_> set = new HashSet<>();
		
		set.add(new Member_("홍길동", 30));
		set.add(new Member_("홍길동", 30));
		
		System.out.println("총 객체 수 : " + set.size());
	}
}
