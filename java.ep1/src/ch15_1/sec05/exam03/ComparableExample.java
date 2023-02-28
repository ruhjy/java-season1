package ch15_1.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<Person> set = new TreeSet<>();

		// 객체 저장
		set.add(new Person("홍길동", 45));
		set.add(new Person("감자바", 25));
		set.add(new Person("신용권", 31));
		set.add(new Person("타노스", 58));

		// 객체를 하나씩 가져오기
		for (Person p : set) {
			System.out.println(p.getName() + ":" + p.getAge());
		}

	}
}
