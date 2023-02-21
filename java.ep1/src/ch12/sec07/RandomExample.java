package ch12.sec07;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomExample {
	public static void main(String[] args) {

		int[] selectNumber = new int[6];
		Random random = new Random(4);

		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
	}
}
