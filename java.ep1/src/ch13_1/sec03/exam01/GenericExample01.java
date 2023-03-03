package ch13_1.sec03.exam01;

import java.util.HashMap;
import java.util.Map;

public class GenericExample01 {

	// 제네릭 메서드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	Map<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		// 제네릭 메서드 호출
		Box<String> box1 = boxing("홍길동");
		String value1 = box1.get();
		System.out.println("value1 : " + value1);

		Box<Integer> box2 = boxing(100);
		int value2 = box2.get();
		System.out.println("value2 : " + value2);
	}
}
