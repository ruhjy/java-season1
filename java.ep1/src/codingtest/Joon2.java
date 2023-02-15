package codingtest;

import java.util.Scanner;

public class Joon2 {
	public static void main(String[] args) {
		// 18108번
		String input = """
				2562
				""";
		
		Scanner scan = new Scanner(input);
		int set = 543;
		int num1 = scan.nextInt();
		System.out.println(num1 - set);
	}
}
