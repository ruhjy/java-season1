package jungsuk.ch11;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex11_09 {
	public static void main(String[] args) {
		Object[] objArr = { "1-", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
//		Set set = new HashSet();
		Set set = new LinkedHashSet();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		// 저장된 요소 출력
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		set.remove("1-");
		System.out.println(set);

	}
}
