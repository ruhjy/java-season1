package createstream.stream001;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Stream003 {
	public static void main(String[] args) {

//		IntStream intStream = new Random().ints(1, 46);
//		intStream.distinct().limit(6).sorted().forEach(System.out::println);
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum1 += intArr[i];
		}
		System.out.println(sum1);
		
		for(int i : intArr) {
			sum2 += i;
		}
		System.out.println(sum2);
		IntStream intStream = Arrays.stream(intArr);
		int sum = intStream.reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}
