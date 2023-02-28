package ch15_1.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		// 비교자를 제공한 TreeSet 컬렉션 생성
		TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());

		// 객체 저장
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 5000));
		treeSet.add(new Fruit("사과", 1500));
		treeSet.add(new Fruit("키위", 2500));

		// 객체를 하나씩 가져오기
		for (Fruit f : treeSet) {
			System.out.println(f.getName() + ":" + f.getPrice());
		}

	}
}
