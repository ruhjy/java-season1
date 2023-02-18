package jungsuk.ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex11_1 {
	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		// list1에 인덱스1~4(from~to)를 뽑아서 새로운 arraylist를 만들어 담는다.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);

		// Collections을 사용해서 list1, list2를 정렬한다.
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);

		// 프린트문으로 list1이 list2의 모든요소를 모함하고 있으면 true
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));

		// list2에 문자열 B, C를 추가하고 인덱스 3인 곳에 A를 추가한다.
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);

		// list2에 인덱스 3인 곳을 AA로 변경한다.
		list2.set(3, "AA");
		print(list1, list2);

		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));

		print(list1, list2);
		
//		System.out.println(list2.get(2));

		for (int i = list2.size()-1; i >= 0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}

		print(list1, list2);

	} // main의 끝

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
