package jungsuk;

import java.util.*;

public class Ex11_1 {
	public static void main(String[] args) throws Exception {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);

		Collections.sort(list1); // list1과 list2를 정렬한다.
		Collections.sort(list2);
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 인덱스가 3인 곳에 "A"를 추가
		print(list1, list2);

		list2.set(3, "AA"); // 인덱스가 3인 곳을 "AA"로 변경
		print(list1, list2);

		list1.add(0, "1");
		// indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
//		System.out.println("index = " + list1.indexOf("1"));	// 0
		System.out.println("index = " + list1.indexOf(new Integer(1))); // 2
//		list1.remove(1);	// 인덱스가 1인 객체를 삭제
		list1.remove(new Integer(1)); // 숫자 1을 삭제

		print(list1, list2);

		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

		print(list1, list2);

		// list2에서 list1에 포함된 객체들을 삭제한다.
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);

	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
