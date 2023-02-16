package test1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(1);
		list.addLast(2);
		list.add(3);
		list.add(1, 10); // [ 1, 10, 2, 3 ]
		System.out.println(list);

		System.out.println(list.contains(1)); // true
		System.out.println(list.contains(4)); // false
		// 넣은 객체 값이 있으면 list에 index값을 반환
		// 없으면 -1 반환
//		System.out.println(list.indexOf(new Integer(10))); 
		System.out.println(list.indexOf(10)); // 위와 같은 코드

		int size = list.size();
		System.out.println("size() = " + size);
		System.out.printf("size() = %d%n", size);

		System.out.println(list.get(1)); // 10

		for (Integer i : list) {
			System.out.print(i + " "); // 1 10 2 3
		}
		System.out.println();

		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " "); // 1 10 2 3
		}
		System.out.println();

		System.out.println(list);
		list.removeFirst();
		System.out.println(list); // [ 10, 2, 3 ]
		list.removeLast();
		System.out.println(list); // [ 10, 2 ]
		list.remove(1);
		System.out.println(list); // [ 10 ]
		list.clear();
		System.out.println(list); // [ ]
	}
}
