package ch15_1.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample2 {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 90);
		map.put("감자바", 50);
		map.put("동장군", 40);
		map.put("홍길동", 100);
		map.put("홍길동", 99);
		map.put("타노스", 77);
		System.out.println(map.size());
		System.out.println();

		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + " : " + value);
		System.out.println();

		// 키 set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> set = map.keySet();
		Iterator<String> keyIterator = set.iterator();

		while (keyIterator.hasNext()) {
			String obj = keyIterator.next();
			System.out.println(obj + " : " + map.get(obj));
		}
		System.out.println();

		// 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		for (Entry<String, Integer> e : entrySet) {
//			System.out.println(e.getKey() + " : " + e.getValue());
//		}

		Set<Entry<String, Integer>> entrySet2 = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet2.iterator();

		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();

			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		System.out.println(map.remove("홍길동"));
		System.out.println();
		
		System.out.println(map.size());
		
		System.out.println(map);
	}
}
