package jungsuk.ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_08 {
	public static void main(String[] args) {
		Integer[] arr = { 30, 50, 10, 40, 20 };
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new DescComp());
		System.out.println(Arrays.toString(arr));
	}
}

class DescComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer) && (o2 instanceof Integer))
			return -1;
		
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
		// return i2 - i1; return i2.compareTo(i1); 도 가능
//		return i1.compareTo(i2) * -1;
//		return i2 - i1;
		return i2.compareTo(i1);
//		return i1 - i2;
	}
	
}