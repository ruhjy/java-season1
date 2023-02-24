package test1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest01 {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		String[] names = { "홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓" };
		int[] nums = { 1234, 4567, 2350, 9870, 3456 };

		// key = String, value = Integer
		// map.put(key,value);
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}

		System.out.println(map);
		System.out.println();

		// map.get(key) return value
		System.out.println("홍길동의 번호 : " + map.get("홍길동"));
		System.out.println();

		// map.keySet()으로 키의 값들만 set컬렉션의 변수 keys에 넣음
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + "의 번호 : " + map.get(key));
		}
		System.out.println();

		// values만 조회
		Collection<Integer> values = map.values();
		for (Integer v : values) {
			System.out.println(v);
		}

		// key, values 쌍으로 조회
		Set<Entry<String, Integer>> entry = map.entrySet();

		for (Map.Entry<String, Integer> e : entry) {
			System.out.println(e.getKey() + "의 번호 : " + e.getValue());
		}

	}
}
